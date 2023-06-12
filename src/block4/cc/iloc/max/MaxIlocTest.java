package block4.cc.iloc.max;

import block4.cc.iloc.asm.Assembler;
import block4.cc.iloc.asm.Simulator;
import block4.cc.iloc.asm.eval.Machine;
import block4.cc.iloc.asm.model.Program;
import block4.cc.iloc.asm.parse.FormatException;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class MaxIlocTest {
    private Assembler assembler;

    @Before
    public void setUp() {
        assembler = new Assembler();
    }

    @Test
    public void testPrettyPrint() throws IOException, FormatException {
        File file = new File("src/block4/cc/iloc/max/max.iloc");
        Program program1 = assembler.assemble(file);
        String pretty = program1.prettyPrint();
        Program program2 = assembler.assemble(pretty);
        assertEquals(program1, program2);
    }

    @Test
    public void testSimulator() throws IOException, FormatException {
        File file = new File("src/block4/cc/iloc/max/max.iloc");
        Program program = assembler.assemble(file);
        Simulator simulator = new Simulator(program);
        Machine machine = simulator.getVM();
        machine.init("a", 1, 4, 3, 7, 2);
        machine.setNum("alength", 5);
        simulator.run();
        int max = machine.getReg("r_max");
        assertEquals(7, max);
    }
}
