package Study;
import java.util.Scanner;
public class StringTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String Here");
		String n = sc.next();
		
		String sub = n.substring(n.indexOf('0'), n.lastIndexOf('0'));
		
		System.out.println("Your String is "+sub);
		
	}

}
