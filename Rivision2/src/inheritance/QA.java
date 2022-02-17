package inheritance;

public class QA extends Employee {
	
	private int not;
	
	public QA()
	{
		super();
		//
	}
	
	public QA(String name, int age, char gen, int id, int ac, String role, int salary,int not)
	{
		super( name,age,gen,id,ac,role,salary);
		this.not = not;
	}
	
	public String toString()
	{
		String str = super.toString();
		
		str += " No of Test :"+not;
		return str;
	}

	@Override
	public double cal_salary() {
		
		double A = getBasicSalary() + (0.2 * getBasicSalary());
		double B = 8000;
		double C = 10 * not;
		double total = A+B+C;
		
		return total;

	}

	public int getNot() {
		return not;
	}

	public void setNot(int not) {
		this.not = not;
	}
	
	public void doWork()
	{
		System.out.println("QA Work");
	}
	
}
