package polymorphism;

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
	@Override
	public boolean equals(Object obj)
	{
		Person p = (Person)obj;
		
		if(this.getName() == p.getName())
		{
			Date d = (Date)p.getDob();
			if(this.getDob().getYear() == d.getYear() && this.getDob().getMonth() == d.getMonth() && this.getDob().getDay()==d.getDay())
			{
				return true;
			}
			else
				return false;
		}
		else
		{
			return false;
		}
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
