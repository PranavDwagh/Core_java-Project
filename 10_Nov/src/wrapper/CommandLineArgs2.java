package wrapper;
import java.util.Scanner;

public class CommandLineArgs2 {

	public static void main(String[] args) {    
		for(String n:args)             
		{
			System.out.println("Lenght of String :"+n.length()+"\nUppercase : "+n.toUpperCase() );   
		}
		
	}
}