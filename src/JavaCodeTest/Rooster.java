package JavaCodeTest;

public class Rooster extends Bird{

	private static final String gender = "Male";
	
	public String getGender() {
		return gender;
	}
	
	@Override
	public void sing()
	{
		System.out.println("Cock-a-doodle-doo");
	}
	
}
