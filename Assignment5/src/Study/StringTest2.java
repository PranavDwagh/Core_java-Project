package Study;
import java.util.Scanner;
public class StringTest2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string here ");
		String str = sc.next();
		
		int f = str.indexOf('0');
		int l = str.lastIndexOf('0');
	
	System.out.println(str.substring(f, l+1));       // f is inclusive and l is exclusive
	}
}
