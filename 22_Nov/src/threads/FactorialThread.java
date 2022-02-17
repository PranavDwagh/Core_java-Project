package threads;

public class FactorialThread extends Thread{

	long x;


	public FactorialThread() {
		x=1;
	}

	public FactorialThread (long input)
	{
		x=input;
	}

	@Override
	public void run() {

		while(x++<15)
		{
			long res = factorial(x);
		//	System.out.println(super.getName()+" "+res);
			System.out.println("Factorial of "+x+" is "+res);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Interrupt Exception cought in Factorial");
			}
		}
	}

	private long factorial(long y)
	{
		
		if (y<2)
		{
			return y;
		}
		else
		{
			long fact = (y)*factorial(y-1);
			return fact;
		}
		
	}
}
