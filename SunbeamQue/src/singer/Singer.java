package singer;

import java.util.Collections;

public class Singer {
	
	private String name;
	private int age;
	private char gen;
	private String contact_no;
	private int rating;
	
	public Singer()
	{
		
	}

	public Singer(String name, int age, char gen, String contact_no, int rating) {
		
		this.name = name;
		this.age = age;
		this.gen = gen;
		this.contact_no = contact_no;
		this.rating = rating;
	}
	
	public String toString()
	{
		String str;
		
		str = "Name :"+name+" Age :"+age+" Gender :"+gen+" Contact No :"+contact_no+" Rating :"+rating;
		
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

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		//this.rating = rating;
		//int rating = sc.nextInt();
		try {
			if (rating <0)
			{
				throw new UnderratedRating(); 
			}
			else if(rating >5)
			{
				throw new OverratedRating();
			}
			else
			{
				this.rating = rating;
			}
		}
		catch (UnderratedRating | OverratedRating e)
		{
			System.out.println(" Enter Rating in the range of 1 to 5 ");

		}
	}

	

}
