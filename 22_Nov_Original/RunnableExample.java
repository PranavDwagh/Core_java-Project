package study.threads;

public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread first = new Thread(new HiTask() );
		first.setName("purple");
		Thread second= new Thread( new HelloTask());
		second.setName("green");
		/*
		first.run(); //this is single thread  main
		second.run();  //this is same thread main
		*/		
		first.start();  // this creates a new thread at OS level and adds it to the ready queue
		second.start(); // when the cpu schedular will schedule the thread then run() is executed
		
		while(true) {
			System.out.println(" main thread running "+ Thread.currentThread().getName());
			Thread.sleep(2000);
		}
		
	}//end of main thread

} //end of MultithreadExample

class HiTask implements Runnable
{
	@Override
	public void run()  {
		while(true) {
			System.out.println("hi "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//end of run
	
}//end of HiTask class

class HelloTask implements Runnable
{
	@Override
	public void run() {
	
		while(true) {
			System.out.println("hello " +Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//end of ru
}//end of HelloTask







