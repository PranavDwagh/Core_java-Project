package study.inheritance;

import study.MyDate;

public class Student extends Person{
	
	private int rollNo;
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Student()
	{
		System.out.println("student no-parameter contructor called");
	}
	
	
	public Student(String n,MyDate d, int rn )
	{
		//super(); //calls no parameter constr of super class--- not compulsary to write - it gets called anyway
		super(n,d);  //person's parameter constr is called
		this.rollNo =rn ;
		System.out.println("parameter constr of Student called");
	}
	
	
	

}
