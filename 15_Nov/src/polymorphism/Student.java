package polymorphism;

public class Student extends Person {
	
	private int rollNo;
	
	public Student()
	{
		// super()  being called here from backend...it will invoke parameterless constructor of super
		System.out.println("Parameterless constructor of student called");
	}
	
	public Student(String n, Date d, int r)
	{
		super(n, d);
		rollNo = r;
		System.out.println("Parameterized Constructor of student getting called..");
	}
	
	public String toString()
	{
		String str;
		str = super.toString();
		str += " Roll No :" + rollNo;
		
		return str;
	}
	
	@Override
	public boolean equals (Object obj)
	{
		Student s = (Student)obj;
		
		if (this.getName().equals(s.getName()) && this.getRollNo() == s.getRollNo())
		{
			Date d = (Date)s.getDob();
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

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	
	
	
	
	
}
