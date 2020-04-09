package JavaCodeTest;

public class Fish implements Animal {	
	@Override
	public void swim()
	{
		System.out.println("I am swimming");
	}

	@Override
	public void walk() {
		System.out.println("I cannot walk");	
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}

	@Override
	public void sing() {
		System.out.println("I cannot sing");
		
	}
}
