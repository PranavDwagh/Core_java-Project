package threads;

public class DaemonExample {
	public static void main(String[] args) {

		new Thread(new Company()).start();
		
		Thread chai = new Thread(new Chai());
		
		chai.setDaemon(true);             // chai set as Daemon...when company ends chai will automatically ends
		
		chai.start();

	}


}

class Company implements Runnable
{

	@Override
	public void run() {

		for (int i=0; i<10;i++)
		{
			System.out.println("Company Running !!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}

class Chai implements Runnable
{

	@Override
	public void run() {


		while(true)
		{
			System.out.println("Chai Running!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}