package Inheritance;



public class Employee extends Person{
	
	int empid;
	String dept;
	int salary;
	
	public Employee()
	{
		System.out.println("Parameterless Constructor of Employee is called");
	}
	
	public Employee(String name, Date dob, int id, String d, int s)
	{
		super(name, dob);
		empid = id;
		dept = d;
		salary = s;
		System.out.println("Parameterized constructor of employee is getting called.");
	}
	
	public String toString()
	{
		String str;
		str = super.toString();
		str += " Employee ID :"+empid+ " Department :"+ dept+ " Salary:"+ salary;
		return str;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
