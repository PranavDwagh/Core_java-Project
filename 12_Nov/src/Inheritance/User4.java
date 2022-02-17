package Inheritance;



public class User4 {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setDept("R&D");
		employee.setEmpid(500);
		employee.setDob(new Date(17, 01, 1997));
		employee.setSalary(500);
		employee.setName("Pranav");
		
		System.out.println(employee);
		
		Employee emp = new Employee("Pranav", new Date(20, 20, 20), 100, "Mechanical", 200);
				System.out.println(emp);
		
		
		
	}
}
