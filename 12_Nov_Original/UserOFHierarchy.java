package study.inheritance.users;

import study.MyDate;
import study.inheritance.InternshipStudent;
import study.inheritance.Student;

public class UserOFHierarchy {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Rohan");  //using subclass reference to call super class methods = REUSE 
		s.setDob(new MyDate(12,12,2012));
		s.setRollNo(22);
		
		MyDate temp = s.getDob();
		System.out.println(s.getRollNo()+"  "+s.getName()+"  "+temp.getDay()+"-"+temp.getMonth()+"-"+temp.getYear());
		
		InternshipStudent istud = new InternshipStudent();
		istud.setName("Ajinkya");
		istud.setDob(new MyDate(2,2,2002));
		istud.setRollNo(45);
		istud.setStipend(5000);
		
		System.out.println(istud.getName()+" "+istud.getRollNo()+" "+istud.getStipend());
		
	}

}
