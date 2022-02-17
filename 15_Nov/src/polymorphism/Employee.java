package polymorphism;

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
@Override
	public String toString()
	{
		String str;
		str = super.toString();
		str += " Employee ID :"+empid+ " Department :"+ dept+ " Salary:"+ salary;
		return str;
	}

	@Override
	public boolean equals(Object obj)
	{
		Employee e = (Employee)obj;

		if(this.getName().equals(e.getName()) && this.getDept().equals(e.getDept()) && this.getEmpid() == e.getEmpid() && this.getSalary() == e.getSalary()) 
		{
			Date d = (Date)e.getDob();
			if(this.getDob().getYear() == d.getYear() && this.getDob().getMonth() == d.getMonth() && this.getDob().getDay()==d.getDay())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
			return false;
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
