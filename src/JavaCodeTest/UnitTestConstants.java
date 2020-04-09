package JavaCodeTest;

public enum UnitTestConstants {
	Walk("I am walking"),
	Fly("I am flying"),
	Sing("I am singing"),
	Swim("I am swimming!"),
	DuckSound("Quack, quack!!"),
	ChickenSound("Cluck, cluck!!"),
	ChickenCannotFly("I cannot fly"),
	RoosterSound("Cock-a-doodle-doo");
	
	private final String _action;
	
	private UnitTestConstants(String action) {
		this._action = action;
	}
	
	public String getAction() {
		return _action + System.lineSeparator();
	}
}
