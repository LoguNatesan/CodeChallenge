package JavaCodeTest;

public class Chicken extends Bird{
	
	private static final String gender = "Female";
	
	private String type;
	
	public Chicken(String type)
	{
		this.type = type;
	}
	
	public String getGender() {
		return gender;
	}

	@Override
	public void sing()
	{
		if(type == "Chicken") {
			System.out.println("Cluck, cluck!!");
		} else if (type == "Rooster") {
			System.out.println("Cock-a-doodle-doo");
		}
	}

	@Override
	public void fly()
	{
		System.out.println("I cannot fly");
	}
}
