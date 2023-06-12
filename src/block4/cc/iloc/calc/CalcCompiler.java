package block4.cc.iloc.calc;

import block4.cc.ErrorListener;
import block4.cc.iloc.CalcBaseListener;
import block4.cc.iloc.CalcLexer;
import block4.cc.iloc.CalcParser;
import block4.cc.iloc.asm.Simulator;
import block4.cc.iloc.asm.model.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Compiler from Calc.g4 to ILOC. */
public class CalcCompiler extends CalcBaseListener {

	/** Program under construction. */
	private Program prog;

    private ParseTreeProperty<Reg> regs = new ParseTreeProperty<>();

    private static int uniqueId = 0;

	/** Compiles a given expression string into an ILOC program. */
	public Program compile(String text) {
		Program result = null;
		ErrorListener listener = new ErrorListener();
		CharStream chars = CharStreams.fromString(text);
		Lexer lexer = new CalcLexer(chars);
		lexer.removeErrorListeners();
		lexer.addErrorListener(listener);
		TokenStream tokens = new CommonTokenStream(lexer);
		CalcParser parser = new CalcParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(listener);
		CalcParser.CompleteContext tree = parser.complete();
		if (listener.hasErrors()) {
			System.out.printf("Parse errors in %s:%n", text);
			for (String error : listener.getErrors()) {
				System.err.println(error);
			}
		} else {
			result = compile(tree);
		}
		return result;
	}

	/** Compiles a given Calc-parse tree into an ILOC program. */
	public Program compile(ParseTree tree) {
        prog = new Program();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
        return prog;
    }

    @Override
    public void exitComplete(CalcParser.CompleteContext ctx) {
        Reg reg = regs.get(ctx.expr());
        emit(OpCode.out, new Str("Result: "), reg);
    }

    @Override
    public void exitTimes(CalcParser.TimesContext ctx) {
        Reg reg1 = regs.get(ctx.expr(0));
        Reg reg2 = regs.get(ctx.expr(1));
        emit(OpCode.mult, reg1, reg2, reg1);
        regs.put(ctx, reg1);
    }

    @Override
    public void exitMinus(CalcParser.MinusContext ctx) {
        Reg reg = regs.get(ctx.expr());
        emit(OpCode.multI, reg, new Num(-1), reg);
        regs.put(ctx, reg);
    }

    @Override
    public void exitPlus(CalcParser.PlusContext ctx) {
        Reg reg1 = regs.get(ctx.expr(0));
        Reg reg2 = regs.get(ctx.expr(1));
        emit(OpCode.add, reg1, reg2, reg1);
        regs.put(ctx, reg1);
    }

    @Override
    public void exitPar(CalcParser.ParContext ctx) {
        regs.put(ctx, regs.get(ctx));
    }

    @Override
    public void exitNumber(CalcParser.NumberContext ctx) {
        Reg reg = new Reg("r_" + uniqueId++);
        int number = Integer.parseInt(ctx.NUMBER().getText());
        emit(OpCode.loadI, new Num(number), reg);
        regs.put(ctx, reg);
    }

	/** Constructs an operation from the parameters
	 * and adds it to the program under construction. */
	private void emit(OpCode opCode, Operand... args) {
		this.prog.addInstr(new Op(opCode, args));
	}

	/** Calls the compiler, and simulates and prints the compiled program. */
	public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Expression: ");
                String expr = in.readLine();
                CalcCompiler compiler = new CalcCompiler();
                Program prog = compiler.compile(expr);
                new Simulator(prog).run();
                System.out.println("\n" + prog.prettyPrint());
            }
        } catch (IOException ignored) {
        }
	}
}
