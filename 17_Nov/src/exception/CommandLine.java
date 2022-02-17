package exception;

import java.util.InputMismatchException;

public class CommandLine {
	public static void main(String[] args) {
		
		try {
		System.out.println("Upper Case of I/p String :"+args[0].toUpperCase());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input String");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
		int x = Integer.parseInt(args[1]);
		System.out.println("Square of "+args[1]+" is "+(x*x));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input String is not a number");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input String is not a number");
		}
		catch(Exception p)
		{
			System.out.println(p);
		}
	}

}
