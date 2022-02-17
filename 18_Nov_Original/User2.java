package study.generics;

import study.MyDate;

public class User2 {

	public static void main(String[] args) {
		MyGenericStack<Integer> stack = new MyGenericStack<>(new Integer[5]);
		
		stack.push(34);  //int----autoboxing --->Integer  is a Object 
		stack.push(55);
		//stack.push(new MyDate(12,12,1212));
		//stack.push("lalala");
		stack.push(23);
		stack.push(66);
		stack.push(88);
		
		//pop an element and show its square
		while(true)
		{
			try {
			int x = stack.pop();
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

