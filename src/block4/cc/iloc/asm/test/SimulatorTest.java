package block4.cc.iloc.asm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

import block4.cc.iloc.asm.Assembler;
import block4.cc.iloc.asm.Simulator;
import block4.cc.iloc.asm.eval.Machine;
import block4.cc.iloc.asm.model.Program;
import block4.cc.iloc.asm.parse.FormatException;

@SuppressWarnings("javadoc")
public class SimulatorTest {
	@Test//(timeout = 1000)
	public void testFig13() {
		Program p = parse("fig1-3");
		Machine c = new Machine();
		int a = c.init("a", 2);
		c.init("b", 3);
		c.init("c", 4);
		c.init("d", 5);
		new Simulator(p, c).run();
		if (SHOW) {
			System.out.println(c);
		}
		assertEquals(240, c.load(a));
	}

	@Test(timeout = 1000)
	public void testFig13Stack() {
		Program p = parse("fig1-3-stack");
		Machine c = new Machine();
		int a = c.init("a", 2);
		c.init("b", 3);
		c.init("c", 4);
		c.init("d", 5);
		new Simulator(p, c).run();
		if (SHOW) {
			System.out.println(c);
		}
		assertEquals(240, c.load(a));
	}

	@Test(timeout = 1000)
	public void testFig13Init() {
		Program p = parse("fig1-3-init");
		Machine c = new Machine();
		c.store(2, p.getSymb("a"));
		c.store(3, p.getSymb("b"));
		c.store(4, p.getSymb("c"));
		c.store(5, p.getSymb("d"));
		new Simulator(p, c).run();
		if (SHOW) {
			System.out.println(c);
			System.out.println(p.prettyPrint());
		}
		assertEquals(240, c.load(p.getSymb("a")));
	}

	@Test(timeout = 1000)
	public void testString() {
		Program p = parse("string");
		Simulator sim = new Simulator(p);
		sim.setIn(new ByteArrayInputStream("abc".getBytes()));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		sim.setOut(out);
		sim.run();
		if (SHOW) {
			System.out.println(p.prettyPrint());
		}
		assertEquals("Doubled: abcabc", out.toString().trim());
	}

	@Test
	//(timeout = 1000)
	public void testStringChar4() {
		Program p = parse("string4");
		Simulator sim = new Simulator(p);
		sim.getVM().setCharSize(4);
		sim.setIn(new ByteArrayInputStream("abc".getBytes()));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		sim.setOut(out);
		sim.run();
		if (SHOW) {
			System.out.println(p.prettyPrint());
		}
		assertEquals("Doubled: abcabc", out.toString().trim());
	}

	Program parse(String filename) {
		File file = new File(filename + ".iloc");
		if (!file.exists()) {
			file = new File(BASE_DIR + filename + ".iloc");
		}
		try {
			return Assembler.instance().assemble(file);
		} catch (FormatException | IOException e) {
			fail(e.getMessage());
			return null;
		}
	}

	private final static String BASE_DIR = "pp/iloc/sample/";
	private final static boolean SHOW = true;
}
