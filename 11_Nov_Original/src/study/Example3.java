package study;

public class Example3 {
	
	public static void main(String[] args) {
		func1(10);
	}

	
	public static void func1(int x)
	{
		System.out.println(x);
		x--;
		if(x > 0)
		func1(x);
		else return;
	}
	
	
}
