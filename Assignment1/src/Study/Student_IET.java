package Study;

public class Student_IET {
	
	private String first_name;
	private String last_name;
	private int age;
	private int grad_yr;
	private String grad_stream;
	
	public Student_IET()
	{
		first_name = "";
		last_name = "";
		age = 0;
		grad_yr= 00;
		grad_stream = "unkown";
	}
	
	
	public Student_IET(String fname, String lname, int a, int gy, String gs)
	{
		first_name = fname;
		last_name = lname;
		age = a;
		grad_yr = gy;
		grad_stream = gs;
	}
	
	public String toString()
	{
		String str = "";
		str+= "First Name :" + getFirst_name()+ " Last Name :" + last_name+ " Age : " +age+ " Graduation Year :"+ grad_yr+ " Graduation Stream : " + grad_stream;
		return str;
	}

	public String getFirst_name() {
		if(first_name.equals(""))
			return "Invalid Name";
		else
		return first_name;
	}

	public void setFirst_name(String first_name) {
		
		/*if(first_name.equals(""))
			System.out.println("Enter valid name");
		else*/
		this.first_name = first_name;
	}

	public String getLast_name() {
		if(last_name.equals(""))
			return "Invalid Name";
		else
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		if (age > 80 || age<18)
			return 0;
		else
		return age;
	}

	public void setAge(int age) {
		if (age > 80 || age<18)
			System.out.println("Invalid age of "+getFirst_name());
		else
		this.age = age;
	}

	public int getGrad_yr() {
		return grad_yr;
	}

	public void setGrad_yr(int grad_yr) {
		if(grad_yr <2018)
		{
			this.grad_yr = 0;
			System.out.println("Invalid Graduation Year entered for "+getFirst_name());
		}
		else
		this.grad_yr = grad_yr;
	}

	public String getGrad_stream() {
		
		return grad_stream;
	}

	public void setGrad_stream(String grad_stream) {
		if(grad_stream.equals("Computer") ||grad_stream.equals("IT") ||grad_stream.equals("Mechanical") ||grad_stream.equals("Electrical") ||grad_stream.equals("Chemical") )
		this.grad_stream = grad_stream;
		else
			this.grad_stream = "Invalid Stream";
	}
	
	
	
	
	
	
	
}
