import java.util.Scanner;
public class StringTest2 {
	public static void main(String[] args) {
		System.out.println("Enter your string here ");
		
		Scanner sc = new Scanner (System.in);
		
//		String s1 = sc.next();
//		
//		System.out.println("Enter your second String");
//		String s2 = sc.next();
//		System.out.println("Enter your Third String");
//		String s3 = sc.next();
		String s1 = "Pranav";
		String s2 = "Pranav";       // same string made up of literals are made on constant pool
								// when same 2nd string defined that string will refer to address of first string 
								// no new string is made hence both are having same address
		String s3 = new String("Pranav");   // String made using new keyword always made on heap

		if(s1 == s2)
		{
			System.out.println("S1 and s2 having same address");
		}

		if(s1 == s3)
		{
			System.out.println("S1 and S3 having same address");
		}

		 if(s2 == s3)
		{
			System.out.println("S2 and S3 having same address");
		}
		else
		{
			System.out.println("S1 and S3 are'nt related");
		}







	}
}
