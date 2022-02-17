package study.inheritance;

import study.MyDate;

public class Person {
	
	private String name;
	private MyDate dob;
	
	public MyDate getDob() {
		return dob;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDob(MyDate dob) {
		this.dob = dob;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Person()
	{
		System.out.println("Person no parameter constructor called ");
	}

	
	public Person(String n, MyDate d)
	{
		name=n;
		dob=d;
		System.out.println("Person parameter constr called");
	}
	
	
	
	
	
	
	
	
}
