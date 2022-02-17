package polymorphism;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		System.out.println("Parameterless Constructor of Date called");
		day = 0;
		month = 0;
		year = 0;
	}
	
	public Date(int d, int m, int y)
	{
		//System.out.println("Parameterized constructor of date getting called");
		day = d;
		month = m;
		year = y;
	}
	
	@Override
	public String toString()
	{
		String str = day+"/"+month+"/"+year;
		return str;
	}
	// Override is nothing but writing our own function with Object class Method name...
	@Override									// if we dont override the .equals method of Object class then it will compare address always 
	public boolean equals(Object obj)			// and result will be always false when we dont override;
	{
		if (this.getDay() == ((Date)obj).getDay() && this.getMonth() == ((Date)obj).getMonth() && this.getYear() == ((Date)obj).getYear())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setDay(int d)
	{
		day= d;
	}
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
