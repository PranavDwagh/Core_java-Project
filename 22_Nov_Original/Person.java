package study.io;

import java.io.Serializable;
import java.util.Scanner;

import study.collections.MyDate3;

public class Person implements Serializable{

	private String name;
	private MyDate3 dob;

	public Person()
	{
		
	}
	
	public Person(String name, MyDate3 dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}
	
}

class Student extends Person 
{
	    transient Scanner sc= new Scanner(System.in);
		private  int roll;
		public Student()
		{
			
			//value from user
		}

		public Student(String name, MyDate3 dob, int roll) {
			super(name, dob);
			this.roll = roll;
		}

		@Override
		public String toString() {
			return super.toString() + "  Student [roll=" + roll + "]";
		}
		
		
		
}


