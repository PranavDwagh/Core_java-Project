package TryCatchExceptionChaining;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample{ 
	public static void main(String[] args) {

		try {
			System.out.println("1");
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException get caught in catch block");
		}
		//	System.out.println("here we go");   // anything in between try and catch block gives compile time error
		finally 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number we will make its square");
			int x = sc.nextInt();
			System.out.println("Square :"+x*x);
			System.out.println("here we comes in finally block");     // whatever happens finally block always executed 
		}																// exception occurred or don't occurred finally block 
		                                                                // finally block ALWAYS executes
		System.out.println("last line");
	}
}

