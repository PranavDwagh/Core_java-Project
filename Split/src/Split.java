import java.util.Scanner;
public class Split {

	/*
	 * ( use API  = split(), substring, toUppercase, toLowercase  )
			Output   ---------                Welcome Sachin Tendulkar
	 */

	public static void main(String[] args) {

		while (true)
		{
			Scanner sc = new Scanner(System.in);



			System.out.println("Enter Your Full Name :");

			String str = sc.nextLine();
			sc.nextLine();

			System.out.println("Entered string is " +str);

			String [] name = str.split(" ");
			
			String p1 = name[0].substring(0, 1);
			String p2 = name[0].substring(1, name[0].length());

			String p3 = name[1].substring(0, 1);
			String p4 = name[1].substring(1, name[1].length());

			//		System.out.println(p1);
			//		System.out.println(p2);
			//		System.out.println(p3);
			//		System.out.println(p4);

			String last = "Welcome ".concat(p1.toUpperCase().concat(p2.toLowerCase().concat(" ".concat(p3.toUpperCase().concat(p4.toLowerCase())))));

			System.out.println(last);
			System.out.println("To break loop Enter Quit or press any key to continue");
			String q = sc.next();
			if(q.equalsIgnoreCase("Quit"))
				break;
		}

	}
}
