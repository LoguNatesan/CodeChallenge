package JavaCodeTest;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class AnimalTest {
	@Test
	void testWalk() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(outContent);
		System.setOut(ps);
		
		Animal test = new Bird();
		test.walk();
		assertEquals(UnitTestConstants.Walk.getAction(), outContent.toString());
	}

}
