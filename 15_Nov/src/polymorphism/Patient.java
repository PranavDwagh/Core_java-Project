package polymorphism;

public class Patient extends Person {
	
	String dieDes;
	
	public Patient()
	{
		System.out.println("Parameterless Constructor of patient is called");
	}
	
	public Patient(String name, Date dob, String d)
	{
		super(name, dob); 
		dieDes = d;
	}
	@Override
	public String toString()
	{
		String str = super.toString(); 
		str += " Description of Disease :"+dieDes;
		return str;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Patient)
		{
		Patient p = (Patient)obj;
		if(this.getName().equals(p.getName()) && this.getDieDes().equals(p.getDieDes()))
		{
			Date d = (Date)p.getDob();
			if(this.getDob().getYear() == d.getYear() && this.getDob().getMonth() == d.getMonth() && this.getDob().getDay()==d.getDay())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		else
			return false;
	}
		return false;
	}
	

	public String getDieDes() {
		return dieDes;
	}

	public void setDieDes(String dieDes) {
		this.dieDes = dieDes;
	}
	
	
}
