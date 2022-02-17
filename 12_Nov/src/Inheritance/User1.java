package Inheritance;

public class User1 {
	public static void main(String[] args) {

		Student student = new Student();
		
		student.setName("Pranav");
		student.setDob(new Date(17, 9, 1997));
		student.setRollNo(117);
		
		System.out.println(student);
		
		
		
	}
}
