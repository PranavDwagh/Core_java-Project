package threads;

public class Account {

	int balance;
	private static final int  MAX_VALUE = 15000;
	private static final int  MIN_VALUE = 500;
	
	
	public Account()
	{
		balance = 10000;
	}
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void deposite(int amount)
	{
		synchronized (this) {

			while(this.balance + amount > MAX_VALUE)
			{
				try {
				System.out.println("deposite is waiting");
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Deposite wait ended");
			}
			this.balance = this.balance + amount;
		}
	}
	
	public synchronized void withdraw(int amount)
	{
		this.balance = this.balance-amount;
		System.out.println("Withdraw is notifying");
		this.notifyAll();
	}
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
	
	
	
}
