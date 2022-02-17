package study.inheritance;

import study.MyDate;

public class InternshipStudent extends Student{
	
	private double stipend ;
	
	public double getStipend() {
		return stipend;
	}
	
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
	
	public InternshipStudent() {
	    System.out.println("no parameter constructor of InternshipStudent called");
	}
	
	public InternshipStudent(double stipend,String n, MyDate dob, int roll)
	{
		
		super(n,dob,roll);  //parameter constr of Student
		
		this.stipend = stipend;
		System.out.println("parameter constr of Internship stud called");
		
	}

}
