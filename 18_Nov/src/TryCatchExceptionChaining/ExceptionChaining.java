package TryCatchExceptionChaining;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionChaining {
	
	public static void main(String[] args) throws IOException {
		
		try {
			manager();        // exception occurred in supervisor....not handles in manager comes here 
									//we are catching exception which are propagated till here
		}
		catch(IOException e)
		{
			System.out.println("IOException received in main via exception chaining");
		}
		
		System.out.println("Last Line ");
		
	}

	public static void supervisor() throws IOException
	{
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter number in string...any input except number will invoke Exception");
		//String s = sc.next();
	//	int x = Integer.parseInt(s);             // exception occurred here but not handled here so it will passs
		//System.out.println("Square is "+x*x);		// exception to calling function
	    System.out.println("exception throw from supervisor");
	    throw new IOException();         // now we are throwing checked exeption we have to mention throws in declaration
	    
	}
	
	public static void manager() throws NumberFormatException, IOException
	{
		supervisor();                  // exception is occure in supervisor function that comes here
	}									// if it is not handled here it will pass to calling function of manager
	
	
	
	
}
