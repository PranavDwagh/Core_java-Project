package polymorphism;

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
	@Override
	public String toString()
	{
		String str;
		str = super.toString();
		str += " Stipend :"+ stipend;
		return str;
	}
	@Override
	public boolean equals(Object obj)
	{
		Intern i = (Intern)obj;
		if(this.getName().equals(i.getName()) && this.getRollNo() == i.getRollNo() && this.getStipend() == i.getStipend())
		{
			Date d = i.getDob();
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
	
	public void setStipend(int s)
	{
		stipend= s;
	}
	
	public int getStipend()
	{
		return stipend;
	}
	
	
}
