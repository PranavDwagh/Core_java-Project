package inheritance;

public class Manager extends Employee {
	
	int maxTeamSize;
	
	public Manager()
	{
		super();
		//
	}

	public Manager(String name, int age, char gen, int id, int ac, String role, int salary, int teamSize)
	{
		super( name,age,gen,id,ac,role,salary);
		
		maxTeamSize = teamSize;
	}
	
	public String toString()
	{
		String str = super.toString();
		str += " Max Team Size :"+maxTeamSize;
		return str;
	}
	public void doWork()
	{
		System.out.println("Manager Work");
	}
	

	public void setMaxTeamSize(int size)
	{
		maxTeamSize = size;
	}
	
	public int getMaxTeamSize()
	{
		return maxTeamSize;	
	}

	@Override
	public double cal_salary() {
		
		double a = getBasicSalary() + (0.5)*getBasicSalary();
		double b = 10000;
		double Total = a+b;
		
		return Total;

	}
	
}
