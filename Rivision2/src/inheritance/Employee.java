package inheritance;

public abstract class Employee extends Person {

	private int empID;
	private int bankACNo;
	private String role;
	private int basicSalary;
	
	public Employee()
	{
		super();
		//
	}
	
	public Employee(String name, int age, char gen, int id, int ac, String role, int salary)
	{
		super(name, age, gen);
		empID = id;
		bankACNo = ac;
		this.role = role;
		basicSalary = salary;
	}
	
	public String toString()
	{
		String str = super.toString();
		str += " Employee ID :"+empID+ " Bank Account No : "+bankACNo+ " Role :"+role+" Basic Salary: "+basicSalary;
		return str;
	}
	
	public final void pay_salary()
	{
		System.out.println(cal_salary());
	}
	
	public abstract double cal_salary();
	
	public void doWork()
	{
		System.out.println("No Work");
	}
	

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getBankACNo() {
		return bankACNo;
	}

	public void setBankACNo(int bankACNo) {
		this.bankACNo = bankACNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	
}
