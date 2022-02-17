package FileIO;

import java.io.Serializable;
import java.util.Comparator;

public class Mydate4 implements Comparable<Mydate4>, Serializable{

	private int day;
	private int month;
	private int year;

	public Mydate4()
	{

	}
	@Override
	public boolean equals(Object o1) {
		Mydate4 o = (Mydate4)o1;
		if (this.getYear() == o.getYear() && this.getMonth() == o.getMonth() && this.getDay() == o.getDay())
		{
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		String s = day+""+month+""+year;  //10102001 
		int hc = Integer.parseInt(s);
		return hc;
	}

	public Mydate4(int day, int month, int year) {

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

	@Override
	public int compareTo(Mydate4 o) {

		System.out.println("compare to called for "+ this+" and "+o);

		if(this.year > o.year)  return 1;
		if(this.year < o.year)  return -1;
		else //year is same
		{
			if(this.month>o.month)  return 1;
			if( this.month <o.month) return -1;
			else //month is same
			{
				if( this.day > o.day)  return 1;
				if(this.day < o.day)  return -1;
				else  //day is same
					return 0;
			}
		}

	}
	}


