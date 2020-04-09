package JavaCodeTest;

class Bird implements Animal{

	@Override
	public void fly()
	{
		System.out.println("I am flying");
	}
	
	@Override
	public void sing()
	{
		System.out.println("I am singing");
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}
}
