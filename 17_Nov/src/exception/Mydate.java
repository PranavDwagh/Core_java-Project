package exception;

public class Mydate {

	private int date;
	private int month;
	private int year;

	public Mydate()
	{
	//	System.out.println("Parameterless Constructor of Mydate");
	}

	public Mydate(int date, int month, int year) {

		try {
				if(date>31)
				{
					throw new wrongDayException();
				}
				else
				{
					this.date = date;
				}
		}
		catch(wrongDayException e)
		{
			System.out.println(e);
			System.out.println("Invalid day Exception Handled");
		}

		try
		{
		if(month>12)
		{
			throw new wrongMonthException();
		}
		else
		{
			this.month = month;
		}
		}
		catch (wrongMonthException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("Invalid Month Exception Handled");
		}
		this.year = year;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		try {
			if(date>31)
			{
				throw new wrongDayException();
			}
			else
			{
				this.date = date;
			}
	}
	
	catch(wrongDayException e)
	{
		System.out.println(e);
		System.out.println("Invalid day Exception Handled");
	}
	}
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		try
		{
		if(month>12)
		{
			throw new wrongMonthException();
		}
		else
		{
			this.month = month;
		}
		}
		catch (wrongMonthException e) {
			System.out.println(e);
			System.out.println("Invalid Month Exception Handled");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	



}
