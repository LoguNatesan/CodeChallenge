package JavaCodeTest;

public enum UnitTestConstants {
	Walk("I am walking"),
	Fly("I am flying"),
	Sing("I am singing"),
	Swim("I am swimming!"),
	DuckSound("Quack, quack!!"),
	ChickenSound("Cluck, cluck!!"),
	ChickenCannotFly("I cannot fly"),
	RoosterSound("Cock-a-doodle-doo"),
	DogSound("Woof, woof"),
	CatSound("Meow"),
	SharkSize("Shark->I am Large"),
	SharkColour("Shark->I am Grey"),
	SharkHabit("Shark->I can eat other fishes"),
	SharkCharacter("Shark->I cannot make jokes"),
	SharkSwim("Shark->I am swimming!"),
	SharkFly("Shark->I cannot fly"),
	ClownFishSize("ClownFish->I am small"),
	ClownFishColour("ClownFish->I am Orange"),
	ClownFishHabit("ClownFish->I can make jokes"),
	ClownFishCharacter("ClownFish->I cannot eat other fishes"),
	CannotWalk("I cannot walk");
	
	private final String _action;
	
	private UnitTestConstants(String action) {
		this._action = action;
	}
	
	public String getAction() {
		return _action + System.lineSeparator();
	}
}
