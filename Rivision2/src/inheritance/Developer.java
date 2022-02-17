package inheritance;

public class Developer extends Employee{

	private int  loc;
	
	
	public Developer()
	{
		super();
	}
	
	public Developer(String name, int age, char gen, int id, int ac, String role, int salary, int loc)
	{
		super( name,age,gen,id,ac,role,salary);
		this.loc = loc;
	}

	public String toString()
	{
		String str = super.toString();
		str += "Lines of Code :"+ loc;
		
		return str;
	}

	@Override
	public double cal_salary() {
		double A = getBasicSalary() + (0.25 * getBasicSalary());
		double B = 8000;
		double C = 2 * loc;
		double total = A+B+C;
		return total;
	}
	
	public void doWork()
	{
		System.out.println("Developer Work");
	}
}
