package study.exception;

import java.io.IOException;
import java.util.InputMismatchException;

public class ExampleOfThrow {

	public static void main(String[] args) {
		
		//f1(238);
		try {
			f2(366);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static void f1(int x)
	{
		if( x >100) {
			InputMismatchException obj = new InputMismatchException();
			throw obj;  //this is unchecked exception
			//throw new InputMismatchException();
		}
		else
			System.out.println("hurray u entered what i wanted ");
		
	}
	
	
	static void f2(int x) throws IOException  //compiler forces to use danger sign
	{
		if( x >100) {
			
			throw new IOException();
			//throw new InputMismatchException();
		}
		else
			System.out.println("hurray u entered what i wanted ");
		
	}
	

}
