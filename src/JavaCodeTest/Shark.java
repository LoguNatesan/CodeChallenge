package JavaCodeTest;

public class Shark implements Fish{
	@Override
	public void walk() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I cannot walk");
	}

	@Override
	public void fly() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I cannot fly");
	}

	@Override
	public void sing() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I cannot sing");
	}

	@Override
	public void size() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I am Large");
	}

	@Override
	public void colour() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I am Grey");
	}

	@Override
	public void eatotherfish() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I can eat other fishes");
	}

	@Override
	public void canMakeJokes() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I cannot make jokes");
	}

	@Override
	public void swim() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I am swimming!");
	}

}
