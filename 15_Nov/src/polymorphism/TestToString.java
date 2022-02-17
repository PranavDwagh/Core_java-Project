package polymorphism;


public class TestToString {

	public static void main(String[] args) {

		System.out.println("********Date*************");
		Date date = new Date(15, 11, 2021);
		Date date2 = new Date(15, 11, 2021);	

		check(date);
		check(date2);									// .equals method is Object class method (it compares address)
		                                             // we have to override .equals method and write our own logic to get desire result
		boolean res = date.equals(date2);        /// without overriding it will compare the address 
		                                         //(and objects created with new are always created on heap with different address)

	  // date Address == polymorphism.Date@7852e922     /// this result get when we don't write toString in our class
		                                               // and then java implicitly call Object Class Method toString
		                                               // result will be always "Both Objects are Different !!"
		// date2 Address == polymorphism.Date@4e25154f

		if(res)
		{
			System.out.println("Both Objects are same..");
		}
		else
		{
			System.out.println("Both Objects are Different !!");
		}
		// checkEquality(date, date2);     /// Above everything can be checked with CheckEquality Function
		//==========================================================================================================

		System.out.println("******Point*****");
		Point point = new Point(10, 20);
		Point point2 = new Point(10, 20);

		check(point);             // polymorphism.Point@7852e922 result without point toString 
		check(point2);				//polymorphism.Point@4e25154f

		checkEquality(point, point2);


		//==============================================================================================================
		System.out.println("*******Circle*******");
		Circle circle = new Circle(20, new Point(20, 25));

		Circle circle2 = new Circle(10, new Point(20, 25));

		check(circle);     //polymorphism.Circle@7852e922
		check(circle2);    //polymorphism.Circle@4e25154f

		checkEquality(circle, circle2);

		//==============================================================================================================
		System.out.println("*********Product*********");
		Product product = new Product("PS", "8GB", 500, date2);
		Product product2 = new Product("PS", "8GB", 500, date);

		check(product);
		check(product2);

		checkEquality(product, product2);

		//===========================================================================================================

		System.out.println("*********Person**********");
		Person person = new Person("Pranav", date2);
		Person person2 = new Person("Pranav", date);
		
		check(person);
		check(person2);
		
		checkEquality(person, person2);
		
		//===========================================================================================================
		
		System.out.println("***********Student**********");
		Student student = new Student("Pranav", date, 50);
		Student student2 = new Student("Pranav", date2, 50);
		
		check(student);
		check(student2);
		
		checkEquality(student, student2);
		
		//===========================================================================================================
		
		
		System.out.println("*********Employee*********");
		Employee employee = new Employee("Pranav", date2, 50, "Mech", 200);
		Employee employee2 = new Employee("Pranav", date2, 50, "Mech", 200);
		
		check(employee2);
		check(employee);
		
		checkEquality(employee, employee2);
		
		//==========================================================================================================
		
		System.out.println("***********Patient************");
		Patient patient = new Patient("Pranav", date, "Cancer");
		Patient patient2 = new Patient("Pranav", date2, "Cancer");
		
		check(patient);
		check(patient2);
		
		checkEquality(patient, patient2);
		//==========================================================================================================
	
		System.out.println("********Intern*********");
		
	   Intern intern = new Intern("Pranav", date, 51, 500);
	   Intern intern2 = new Intern("Pranav", date, 51, 500);
	
	   check(intern);
	   check(intern2);
	
	   checkEquality(intern, intern2);
	   
	   //===========================================================================================================
	
	   System.out.println("***********Book**********");
	   String [] arr = new String[] {"AAA", "BBB"};
	   String [] arr2 = new String[] {"aaa"};
	   
	   Book book = new Book(500, "ABC", arr);	
	   Book book2 = new Book(500, "ABC", arr);	
	
	   check(book);
	   check(book2);
	   
	   checkEquality(book, book2);
	   
	   //============================================================================================================
	   
	}
	public static void check(Object obj)
	{
		System.out.println(obj.toString());         // when we have written a toString method in our class then Object will call our class toString as it was overriden 
	}												// in java always child class method will get called when method with same  name present in both the class

	public static void checkEquality(Object obj1, Object obj2)
	{
		boolean res = obj1.equals(obj2);
		if(res)
		{
			System.out.println("Both Objects are same..");
		}
		else
		{
			System.out.println("Both Objects are Different !!");
		}
	}

}
