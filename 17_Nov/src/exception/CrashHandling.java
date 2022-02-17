package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CrashHandling {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int division = 0;
		try {
		System.out.println("Enter Divident");
		int divident = sc.nextInt();
		
		System.out.println("Enter Divisor");
		int divsor = sc.nextInt();
		
		 division = divident/divsor;
		
		System.out.println("Final Division : "+division);
		}
		
		catch (ArithmeticException | InputMismatchException ae)
		{
			System.out.println("1"+ae);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
 
}
