package threads;

public class ThreadJoin {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new anythread());
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("hi");
		
		Thread t2 = new Thread(new anythread());
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.setName("Hello");
		
		t1.start();
		t2.start();

	}
}

class anythread implements Runnable
{
	@Override
	public void run() {
		for (int i=0; i<10;i++)
		{
			System.out.println("say "+Thread.currentThread().getName()+" "+"("+Thread.currentThread().getPriority()+")");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


	
