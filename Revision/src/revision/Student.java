package revision;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	private int age;
	private int [] marks;
	
	public Student(String n, int a)
	{
		name = n;
		age = a;
		marks = new int[] {0,0,0};
		
	}
	
	public Student(String n, int a, int [] m)
	{
		name = n;
		age = a;
		marks = m;
	}
	
	public String toString()
	{
		String str;
		str = "Name :"+ name+ " Age :"+age+ " Marks :"+getMarksinString(marks);
		return str;
	}

	private String getMarksinString(int[] marks2) {
		
		String str = "";
		for (int i=0; i<marks2.length ;i++)
		{
			str += marks2[i]+" ";
		}
		return str;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
}
