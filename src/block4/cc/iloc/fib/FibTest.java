package block4.cc.iloc.fib;

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

public class FibTest {
    private Assembler assembler;

    @Before
    public void setUp() {
        assembler = new Assembler();
    }

    @Test
    public void testFib() throws IOException, FormatException {
        int m2m = runFibM2M(10);
        int r2r = runFibR2R(10);
        assertEquals(89, m2m);
        assertEquals(89, r2r);
    }

    private int runFibR2R(int n) throws IOException, FormatException {
        File file = new File("src/block4/cc/iloc/fib/fib-r2r.iloc");
        Program program = assembler.assemble(file);
        Simulator simulator = new Simulator(program);
        Machine vm = simulator.getVM();
        vm.setReg("r_n", n);
        simulator.run();
        return vm.getReg("r_z");
    }

    private Integer runFibM2M(int n) throws IOException, FormatException {
        File file = new File("src/block4/cc/iloc/fib/fib-m2m.iloc");
        Program program = assembler.assemble(file);
        Simulator simulator = new Simulator(program);
        Machine vm = simulator.getVM();
        vm.init("x", 1);
        vm.init("y", 1);
        int addr = vm.init("z", 1);
        vm.init("n", n);
        simulator.run();
        return vm.load(addr);
    }
}
