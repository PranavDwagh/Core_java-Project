package study.threads.threadsafety;

public class DepositThread implements Runnable{


	Account acct;
	
	public DepositThread(Account a) {
		this.acct =a;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			acct.deposit(1000);
			System.out.println("balance after deposit :"+acct.getBalance());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
