package Study;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		
		Student_IET pranav = new Student_IET(" Pranav", "Wagh",20, 2018, "Mech");
		Student_IET pranav1 = new Student_IET();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Student name");
		String name = sc.next();
		pranav1.setFirst_name(name);
		
		System.out.println("Enter Student age");
		int a = sc.nextInt();
		pranav1.setAge(a);
		
		System.out.println("Enter Graduation Year");
		int year = sc.nextInt();
		pranav1.setGrad_yr(year);
		
		System.out.println("Enter Branch");
		String st = sc.next();
		pranav1.setGrad_stream(st);
		
		
		System.out.println("Enter Student last name");
		String ln = sc.next();
		pranav1.setLast_name(ln);
		System.out.println(pranav);
		System.out.println("-->"+pranav1);

	}
}
