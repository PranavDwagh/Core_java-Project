package generics;

public class Stack {

	Object [] arr;
	int top;

	public Stack()
	{
		arr = new Object[5];
		top =-1;
	}
	public Stack(int size)
	{
		arr = new Object[size];
		top =-1;
	}

	public void push(Object obj)
	{
		if (top == arr.length-1)
		{
			System.out.println("stack is full");
		}
		else
		{	 
			top ++;
			arr[top] = obj;
		}
	}

	public Object pop()
	{
		if (top == -1)
		{
			System.out.println("Stack is Empty");
			return null;
		}
		else
		{
			Object obj = arr[top];
			top--;
			return obj;
		}
	}

	public String toString()
	{
		String str = "";

		for (int i=top; i>=0;i--)
		{
			str += ""+ arr[i]+"-->"; 
		}
		return str;
	}

}
