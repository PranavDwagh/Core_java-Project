package study.threads.threadsafety;

public class Account {
	
	private int balance;
	private static final int MAX_BALANCE = 15000;
	private static final int MIN_BALANCE = 500;
	
	
	public Account() {
		balance = 10000;
	}

	public int getBalance() {
		return balance;
	}


	public void deposit(int amount)
	{		//more code
		synchronized(this) {  //synchronized block
		while((this.balance + amount) > MAX_BALANCE ) {
			try {
				System.out.println("deposit is waiting...");
				this.wait();
			   
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("deposit wait ended");
		}//end of while
			this.balance = this.balance +amount;
		
		}//end of syncronized 
		//code code code
	}
	//synchronized method
	public synchronized void withdraw(int amount)
	{	
		this.balance = this.balance -amount;
		System.out.println("withdraw is notifying");
		this.notifyAll();
	}
	
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	

}
