package study.generics;

import study.MyDate;

public class UserOfStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack(new Object[5]);
		
		stack.push(34);  //int----autoboxing --->Integer  is a Object 
		stack.push(55);
		stack.push(new MyDate(12,12,1212));
		stack.push("lalala");
		stack.push(23);
		
		//pop an element and show its square
		while(true)
		{
			try {
			int x = (Integer) stack.pop(); //downcasting, auto Unboxing
			System.out.println(x*x);
			}
			catch(NullPointerException npe)
			{
				System.out.println("stack empty");
				break;
			}
		}
	}
}




