public class TestWrapperClass4 {

	
	public static void main(String[] args) {
		
		//Integer x = 33;
		MyWrapper y = new MyWrapper();
		System.out.println(y);
		y.value = 33;
		System.out.println(y.value);
		increment(y);
		increment(y.value);            
		System.out.println(y.value);
		System.out.println(" y value "+y.value);
	}
	
	public static void increment(Integer x)
	{
		System.out.println(x);
		x=x+5; //boxing + autoboxing
		System.out.println(x);
	}
	
	public static void increment(MyWrapper y)
	{
		System.out.println(y);
		y.value = y.value +1;
	}
}


class MyWrapper
{
	int value;
}