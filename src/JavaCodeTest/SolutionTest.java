package JavaCodeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

//Unit test is done only for Section-A & B

class SolutionTest {

	@Test
	void testMain() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(outContent);
		System.setOut(ps);
		
		String[] args = new String[10];
		Solution.main(args);
		assertEquals(UnitTestConstants.Walk.getAction() 
				+ UnitTestConstants.Fly.getAction() 
				+ UnitTestConstants.Sing.getAction() 
				+ UnitTestConstants.DuckSound.getAction() 
				+ UnitTestConstants.Swim.getAction() 
				+ UnitTestConstants.Fly.getAction() 
				+ UnitTestConstants.RoosterSound.getAction()
				+ UnitTestConstants.ChickenSound.getAction()
				+ UnitTestConstants.RoosterSound.getAction()
				+ UnitTestConstants.DogSound.getAction()
				+ UnitTestConstants.CatSound.getAction()
				+ UnitTestConstants.RoosterSound.getAction()
				+ UnitTestConstants.DuckSound.getAction()
				+ UnitTestConstants.SharkSize.getAction()
				+ UnitTestConstants.SharkColour.getAction()
				+ UnitTestConstants.SharkHabit.getAction()
				+ UnitTestConstants.SharkCharacter.getAction()
				+ UnitTestConstants.ClownFishSize.getAction()
				+ UnitTestConstants.ClownFishColour.getAction()
				+ UnitTestConstants.ClownFishHabit.getAction()
				+ UnitTestConstants.ClownFishCharacter.getAction()
				+ UnitTestConstants.SharkSwim.getAction()
				+ UnitTestConstants.SharkFly.getAction()
				+ UnitTestConstants.Fly.getAction() 
				+ UnitTestConstants.CannotWalk.getAction() 
				+ UnitTestConstants.ChickenCannotFly.getAction()
				+ UnitTestConstants.Walk.getAction()
				, outContent.toString());
	}

}
