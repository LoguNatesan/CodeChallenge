package JavaCodeTest;

public class ClownFish implements Fish{

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
		System.out.println(this.getClass().getSimpleName() + "->" + "I am small");
	}

	@Override
	public void colour() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I am Orange");
	}

	@Override
	public void eatotherfish() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I cannot eat other fishes");
	}

	@Override
	public void canMakeJokes() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I can make jokes");
	}

	@Override
	public void swim() {
		System.out.println(this.getClass().getSimpleName() + "->" + "I am swimming!");
	}
}
