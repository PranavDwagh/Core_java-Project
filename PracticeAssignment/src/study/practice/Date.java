package study.practice;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		//System.out.println("Parameterless Constructor of Date called");
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
	public boolean equals(Object obj) {
		
		Date d = ((Date)obj);
		if (this.getYear() == d.getYear() && this.getMonth() == d.getMonth() && this.getDay() == d.getDay() )
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		String str = day+"/"+month+"/"+year;
		return str;
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
