
//reverse String

import java.util.Scanner;
public class StringBuffer1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String here");
		
		//String str = "Pranav";
		
		StringBuffer input = new StringBuffer();   // StringBuffer gives you mutable string
		
		input.append(sc.nextLine());
		StringBuffer temp = new StringBuffer(input);
		StringBuffer temp2 = new StringBuffer(input);
		
		System.out.println(input);
//		System.out.println("del->"+temp2.delete(1, 5));       // end is exclusive here
		input.reverse();
		System.out.println(input);
		System.out.println("in temp "+temp);
		
		String temp1 = temp.toString();
		
		String input1 = input.toString();
		
		if (temp1.equals(input1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}
}
