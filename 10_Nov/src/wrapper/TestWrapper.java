package wrapper;
import java.util.Scanner;

public class TestWrapper {
	public static void main(String[] args) {
		
		Integer x = new Integer(30);
		
		System.out.println(x);
		increment(x);
		System.out.println(x);	
	}
	public static void increment(Integer x)
	{
		x++;
	}

	


}
