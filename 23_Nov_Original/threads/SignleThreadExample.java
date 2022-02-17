package study.threads;

public class SignleThreadExample {

	public static void main(String[] args) {
	
		hi();
		hello();

	}
	
	public static void hi()
	{
		while(true)
			System.out.println("hi");
	}
	
	
	public static void hello()
	{
		while(true)
			System.out.println("hello");
	}
	
}
