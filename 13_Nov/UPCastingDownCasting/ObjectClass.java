import java.util.Scanner;

public class ObjectClass {
	public static void main(String[] args) {


		//Object obj = new Object();
		Object obj = new String();    // Upcasting
		String str = "Welcome";
		Scanner sc = new Scanner(System.in);

		func(str);   // String object passed
		func(sc);   // Scanner Object Passed

		Object circle = new Circle(20, new Point(40, 30));  //Upcasting of Circle
		func(circle); //Circle Object Passed
		
		Object employee = new Employee(2000, "Pranav");    // Upcasting of Employee
		
		func(employee); // Employee passed to function
		
		
	}

	public static void func(Object obj) {

		if(obj instanceof String)                // Need to do downcasting because of we are catching values in Object type and String is SubClass of Object
			obj = ((String)obj).toUpperCase();      //DownCasting

		System.out.println("In Upper Case :"+obj); 

		if(obj instanceof Circle)
		{
			obj = ((Circle) obj).getRad();
			System.out.println("Radius-->" + obj);
		}
		
		if (obj instanceof Employee) {
			
			int sal = ((Employee)obj).getSalary();
			System.out.println("Salary -->"+sal);
		}
	}
}
