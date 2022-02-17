package study.exception;

import java.io.IOException;
import java.util.Scanner;

public class TestExceptionChaining {

	public static void main(String[] args)  {
		try {
		manager();
		}catch(NumberFormatException ne)
		{
			System.out.println("number dalna tha...cchodo no problem");
		}
	}
	
	public static void supervisor() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		
		//throw new IOException();
		//int x = Integer.parseInt(s);
		
	}

	public static void manager() throws NumberFormatException
	{
			supervisor();
	}
}
