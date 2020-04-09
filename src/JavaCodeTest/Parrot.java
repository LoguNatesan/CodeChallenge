package JavaCodeTest;

public class Parrot extends Bird {
	
	Animal animal = null;
	
	public Parrot(Animal animal)
	{
		this.animal = animal;
	}
	
	@Override
	public void sing() 
	{
		animal.sing();
	}
	
	
}
