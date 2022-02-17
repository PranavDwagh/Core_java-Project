package generics;

public class Generics<G> {

	G [] arr;
	int top;

	public Generics(G [] ar)
	{
		arr = ar;
		top =-1;
	}

	public void push(G obj)
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

	public G pop()
	{
		if (top == -1)
		{
			System.out.println("Stack is Empty");
			return null;
		}
		else
		{
			G obj = arr[top];
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
