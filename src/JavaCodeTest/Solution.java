package JavaCodeTest;

public class Solution {

	public static void main(String[] args) {
		//Bird
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		//Duck
		Animal duck = new Duck();
		duck.sing();
		duck.swim();
		duck.fly();
		
		//Rooster
		Animal roost = new Rooster();
		roost.sing();
		
		//Rooster (Without Inheritance) 
		Animal chicken = new Chicken("Chicken");
		Animal rooster = new Chicken("Rooster");
		
		chicken.sing();
		rooster.sing();
		
		//Parrot Living with Dog
		Parrot parrotwithdog = new Parrot(new Dog());
		parrotwithdog.sing();
		
		//Parrot Living with Cats
		Parrot parrotwithcat = new Parrot(new Cat());
		parrotwithcat.sing();
		
		//Parrot Living with Rooster
		Parrot parrotwithrooster = new Parrot(new Rooster());		
		parrotwithrooster.sing();
		
		//Parrot Living With Duck
		Parrot parrotwithduck = new Parrot(new Duck());		
		parrotwithduck.sing();
		
		//Fish
		Animal fish = (Animal) new Fish();
		fish.swim();
		fish.walk();
		fish.fly();	
	}
}
