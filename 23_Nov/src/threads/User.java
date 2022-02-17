package threads;

public class User {
	public static void main(String[] args) throws InterruptedException {


		Account shared = new Account();

		Thread deposit = new Thread(new DepositeThread(shared));
		Thread withdraw = new Thread(new Withdrawthread(shared));
		withdraw.start();
		deposit.start();
		//withdraw.start();
		withdraw.join();
		System.out.println("main ends...");
	}
}
