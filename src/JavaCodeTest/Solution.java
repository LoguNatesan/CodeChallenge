package JavaCodeTest;

public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Animal duck = new Duck();
		duck.sing();
		duck.swim();
		duck.fly();
		
		Animal roost = new Rooster();
		roost.sing();
		
		Animal chicken = new Chicken("Chicken");
		Animal rooster = new Chicken("Rooster");
		
		chicken.sing();
		rooster.sing();
	}
}
