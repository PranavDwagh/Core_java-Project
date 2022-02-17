package study.exception;




import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingProgram2 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int division=0,divident=0,divisor =0;
		try {
		System.out.println("enter divident");
		 divident = sc.nextInt();
		
		System.out.println("enter divisor");
		 divisor = sc.nextInt();
		
		division = divident/divisor;
		}//end of try
		catch(ArithmeticException | InputMismatchException | NullPointerException ae)
		{
			System.out.println("1"+ae);
			 
		}
		catch(Exception obj)
		{
			System.out.println("2"+obj);
		}

		
		
		System.out.println("LAST LINE  division ="+division);
		
	}

}
