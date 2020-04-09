package JavaCodeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class BirdTest {
	@Test
	void testFly() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(outContent);
		System.setOut(ps);
		
		Bird _bird = new Bird();
		_bird.fly();
		assertEquals(UnitTestConstants.Fly.getAction(), outContent.toString());
	}

	@Test
	void testSing() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(outContent);
		System.setOut(ps);
		
		Bird _bird = new Bird();
		_bird.sing();
		assertEquals(UnitTestConstants.Sing.getAction(), outContent.toString());
	}

	@Test
	void testWalk() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(outContent);
		System.setOut(ps);
		
		Bird _bird = new Bird();
		_bird.walk();
		assertEquals(UnitTestConstants.Walk.getAction(), outContent.toString());
	}

}
