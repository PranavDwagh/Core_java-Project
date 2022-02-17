package inheritance;

public class User {
	public static void main(String[] args) {
		
		Employee qa = new QA("Pranav", 20, 'M', 1005, 451263, "Quality Analyst", 10000, 105);
		Employee dev = new Developer("Pranav", 25, 'M', 1005, 451263, "Quality Analyst", 10000, 1005);
		Employee manager = new Manager("Pranav", 40, 'M', 1005, 451263, "Quality Analyst", 10000, 10);
		//Employee e = new Employee();   // can't create object as this method is abstract
		
		qa.pay_salary();
		System.out.println(qa);
		
		dev.pay_salary();
		System.out.println(dev);
		
		manager.pay_salary();
		System.out.println(manager);
		
	}

}
