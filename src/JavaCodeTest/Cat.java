package JavaCodeTest;

public class Cat implements Animal {

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}

	@Override
	public void sing() {
		System.out.println("Meow");
	}

	@Override
	public void swim() {
		System.out.println("I am swimming!");
	}

}
