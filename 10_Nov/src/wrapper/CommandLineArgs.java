package wrapper;
import java.util.Scanner;

public class CommandLineArgs {

	public static void main(String[] args) {    
		for(String n:args)             ///give commands from Run-> run configuration -> in main select class and in argument give arguments
		{
			System.out.println(n);    // to run it from commad line... go to workspace in same folder where this file stored cd to bin and run
		}								// java wrapper.CommandLineArgs give your command here
		
	}
}
	

