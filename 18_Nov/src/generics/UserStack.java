package generics;

public class UserStack {
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(20);
		
		stack.push("Pranav");
		stack.push(30);
		stack.push(60);
		stack.push(70);
		stack.push(72);
		Object x = stack.pop();
		Object z = stack.pop();

		System.out.println(x);
		System.out.println(stack);


		while (true)
		{
			try
			{
				int y = (Integer)stack.pop();
				System.out.println(y*y); 
			}
			catch (java.lang.ClassCastException e)
			{
				System.out.println("Wrong input given...can't convert to Integer");
				
			}
			catch (NullPointerException e)
			{
				System.out.println("Complete printing done");
				break;
			}

			System.out.println("Last line");

		}

	}
}
