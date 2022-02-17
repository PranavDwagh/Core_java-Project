package study;

public class MyDate {
	
	private int day,month,year;
	
	public MyDate()
	{
		day=1;month=1;year=2000;
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	

}
