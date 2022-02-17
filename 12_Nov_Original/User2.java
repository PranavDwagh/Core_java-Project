package study.inheritance.users;

import study.MyDate;
import study.inheritance.InternshipStudent;

public class User2 {

	public static void main(String[] args) {
	
		InternshipStudent istud = new InternshipStudent(6000, "Akshata", new MyDate(3,3,2003), 13);
		
		System.out.println(istud.getName()+" "+istud.getRollNo()+" "+istud.getStipend());

	}

}
