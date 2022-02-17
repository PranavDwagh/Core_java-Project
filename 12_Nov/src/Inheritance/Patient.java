package Inheritance;



public class Patient extends Person {
	
	String dieDes;
	
	public Patient()
	{
		System.out.println("ParameterLess Constructor of patient is called");
	}
	
	public Patient(String name, Date dob, String d)
	{
		super(name, dob);
		dieDes = d;
	}
	public String toString()
	{
		String str = super.toString(); 
		str += " Description of Disease :"+dieDes;
		return str;
	}

	public String getDieDes() {
		return dieDes;
	}

	public void setDieDes(String dieDes) {
		this.dieDes = dieDes;
	}
	
	
}
