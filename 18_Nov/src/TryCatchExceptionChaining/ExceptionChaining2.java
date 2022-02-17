package TryCatchExceptionChaining;

import java.util.Scanner;

public class ExceptionChaining2 {
	
	public static void main(String[] args) {
		
		try {
			manager();        // exception occurred in supervisor....not handles in manager comes here 
									//we are catching exception which are propagated till here
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException invoked as you enter something other than number");
		}
		
		System.out.println("Last Line ");
		
	}

	public static void supervisor()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number in string...any input except number will invoke Exception");
		String s = sc.next();
		int x = Integer.parseInt(s);             // exception occurred here but not handled here so it will passs
		System.out.println("Square is "+x*x);		// exception to calling function
	}
	
	public static void manager() throws NumberFormatException
	{
		supervisor();                  // exception is occure in supervisor function that comes here
	}									// if it is not handled here it will pass to calling function of manager
	
	
	
	
}
