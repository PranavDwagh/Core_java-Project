package study.exception;



import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingProgram {


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
		catch(ArithmeticException ae)
		{
			System.out.println("1"+ae);
			division = divident/1; 
		}
		catch(InputMismatchException ip)
		{
			System.out.println("3");
			System.out.println("dont enter divident as string");
		}
		catch(Exception obj)
		{
			System.out.println("2"+obj);
		}

		
		
		System.out.println("LAST LINE  division ="+division);
		
	}

}
