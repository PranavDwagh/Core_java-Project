package collection;

public class Mydate3 implements Comparable<Mydate3> {
	
	private int day;
	private int month;
	private int year;
	
	public Mydate3()
	{
		
	}
	@Override
	public int compareTo(Mydate3 obj)
	{
		System.out.println("compareTo method called for this "+this+" and "+obj );
		if(this.year > obj.year)  return 1;
		if(this.year < obj.year)  return -1;
		else //year is same
		{
			if(this.month>obj.month)  return 1;
			if( this.month <obj.month) return -1;
			else //month is same
			{
				if( this.day > obj.day)  return 1;
				if(this.day < obj.day)  return -1;
				else  //day is same
					return 0;
			}
		}
	}
	
	

	public Mydate3(int day, int month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString()
	{
		String str= "Date: "+day+"/"+month+"/"+year;
		return str;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
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
