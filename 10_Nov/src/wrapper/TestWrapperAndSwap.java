package wrapper;
import java.util.Scanner;

public class TestWrapperAndSwap {

	public static void main(String[] args) {
		
		Integer x =30; // auto Boxing    // Integer Wrapper classes are immutable
		System.out.println("Integer "+ x);
		MyWrapper s = new MyWrapper(); // this class is mutable
		s.value = 30;
		increment(x);			// passed by value(where *x = address of 30) but after increment it will X of increment function some 31 which address is different, so will not be any changes here 
		System.out.println("Integer after Increment"+ x);
		System.out.println("MyWrapper before increment "+ s.value);
		increment1(s); // also passes by value (where value of s = address of my wrapper)
		
		System.out.println("Mywrapper after Increment s= "+ s.value);
		MyWrapper s2 = new MyWrapper();
		s2.value = 60;
		System.out.println("Mywrapper before swap s2= "+ s2.value);
		swap(s, s2);
		
		System.out.println("Mywrapper after Swapping s = "+ s.value);
		System.out.println("Mywrapper after Increment s2= "+ s2.value);
	}
	
	public static void increment(Integer x)
	{
		x++;   // auto boxing and unboxing
	}
	
	public static void increment1(MyWrapper x)
	{
		x.value++;   // auto boxing and unboxing
	}
	
	public static void swap(MyWrapper x, MyWrapper y)
	{
		MyWrapper temp = new MyWrapper();
	
		temp.value = x.value;
		x.value=y.value;
		y.value=temp.value;
	}
}

	class MyWrapper
	{
		int value;
	}



