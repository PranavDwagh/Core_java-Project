package TryCatchExceptionChaining;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowTrails {

}

class A
{
	public void f1() throws  IOException 
	{
		System.out.println("In class A");
	//	throw new IOException();
	}
}

class B extends A
{
	
	//@Override
	/*public void f1() throws Exception       //Not Possible
	{
		System.out.println("In class b");
		//throw new IOException();
	}*/
	/*
	public void f1() throws FileNotFoundException     // Valid
	{
		System.out.println("In class b");
		//throw new IOException();
	}
	/*
	public void f1()                                 // valid
	{
		System.out.println("In class b");
		//throw new IOException();
	}
	
	public void f1() throws NumberFormatException   // valid
	{
		System.out.println("In class b");
		//throw new IOException();
		
	}
	/*
	public void f1() throws IOException            // valid
	{
		System.out.println("In class b");
		//throw new IOException();
	}*/
}

