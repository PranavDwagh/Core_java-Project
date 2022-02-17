package Inheritance;



public class Person {
	
	private String name;
	private Date dob;
	
	public Person()
	{
		name = "null";
		dob = new Date();
		System.out.println("Parameterless Constructor of person called.");
	}
	
	public Person(String name, Date d)
	{
		System.out.println("Parameterized Constructor of person getting called");
		this.name = name;
		dob = d;
	}
	
	public String toString()
	{
		String str = "Name: "+name+ " Date of Birth :"+ dob;
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	

}
