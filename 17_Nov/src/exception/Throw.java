package exception;

import java.util.InputMismatchException;

public class Throw {
	public static void main(String[] args) {

		
		f1(150);
	}
	
	/*static void f1(int value)
	{
		if(value>=100)
		{
			throw new InputMismatchException();
		}
		else
			System.out.println("Your have enter correct value");
	}*/
	
	static void f1(int value)
	{
		try {
		if(value>=100)
		{
			throw new InputMismatchException();
		}
		else
			System.out.println("Your have enter correct value");
	}
	
	catch(InputMismatchException e)
		{
			System.out.println("You have entered number grater than 100");
		}
		
	
	
	
	}
}
 