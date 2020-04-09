package JavaCodeTest;

public class Butterfly implements Animal{
	
	private boolean isButterfly = false;
	
	public void setButterfly(boolean isButterfly) {
		this.isButterfly = isButterfly;
	}

	@Override
	public void walk() {
		if(!isButterfly) {
			System.out.println("I am walking");
		}
		else {
			System.out.println("I cannot walk");
		}
	}

	@Override
	public void fly() {
		if(!isButterfly) {
			System.out.println("I cannot fly");
		}
		else {
			System.out.println("I am flying");
		}
	}

	@Override
	public void sing() {
		System.out.println("I cannot sing");
	}

	@Override
	public void swim() {
		System.out.println("I cannot swim");
	}

}
