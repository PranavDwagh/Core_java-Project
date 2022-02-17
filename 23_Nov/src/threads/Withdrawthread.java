package threads;

public class Withdrawthread implements Runnable{

	Account acc;
	
	public Withdrawthread(Account acc)
	{
		this.acc = acc;
	}

	@Override
	public void run() {

		for (int i=0; i<10;i++)
		{
			acc.withdraw(100);
			System.out.println("Balance after Withdraw "+acc.getBalance());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/*
	public String toString()
	{
		String str;
		
		str  = "Balance "+acc.getBalance();
		
		return str;
	}*/
	
	
	
}
