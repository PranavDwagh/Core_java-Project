package Inheritance;



public class Intern extends Student {
	
	int stipend;
	
	public Intern()
	{
		System.out.println("Parameterless Constructor of Intern called");
	}

	public Intern(String n, Date dob, int rn, int s)
	{
		super(n,dob,rn);
		stipend = s;
		System.out.println("Parametrized constructor of Intern is called");
	}
	
	public String toString()
	{
		String str;
		str = super.toString();
		str += " Stipend :"+ stipend;
		return str;
	}
	
	public void setStipend(int s)
	{
		stipend= s;
	}
	
	public int getStipend()
	{
		return stipend;
	}
	
	
}
