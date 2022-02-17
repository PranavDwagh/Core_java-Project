package inheritance;

public abstract class Person {
	
	private String name;
	private int age;
	private char gender;
	
	
	public Person()
	{
		//
	}
	
	
	
	public Person(String n, int a, char gen)
	{
		name = n;
		age = a;
	}
	
	public String toString()
	{
		String str = "Name :"+name+" Age :"+age+ " Genger :"+gender;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	
}
