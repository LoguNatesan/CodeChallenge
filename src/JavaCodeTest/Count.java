package JavaCodeTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		Animal[] animals = new Animal[] { 
				new Bird(), 
				new Duck(), 
				new Chicken("Chicken"), 
				new Rooster(), 
				new Dog(),
				new Cat(),
				new Parrot(new Dog()),
		};
		
		int flycount = 0, walkcount = 0, swimcount = 0, singcount = 0;
		
		String[] outputs = new String[animals.length];
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(outContent);
		PrintStream old = System.out;
		System.setOut(ps);
		
		for (Animal animal : animals) {
			animal.fly();
			animal.walk();
			animal.sing();
			animal.swim();
		}

		System.out.flush();
		System.setOut(old);
		
		outputs = outContent.toString().split(System.lineSeparator());
		
		for(String _output: outputs)
		{
			//System.out.println(_output.toString());
			switch(_output) {
				case "I am flying":
					flycount++;
					break;
				case "I am walking":
					walkcount++;
					break;
				case "I am swimming!":
					swimcount++;
					break;
				case "I am singing":
				case "Meow":
				case "Cluck, cluck!!":
				case "Cock-a-doodle-doo":
				case "Woof, woof":
				case "Quack, quack!!":
					singcount++;
					break;
				default:
						break;
			}
		}
		
		System.out.println("Number of Animals that can fly : " + flycount);
		System.out.println("Number of Animals that can walk : " + walkcount);
		System.out.println("Number of Animals that can sing : " + singcount);
		System.out.println("Number of Animals that can swim : " + swimcount);
	}
}
