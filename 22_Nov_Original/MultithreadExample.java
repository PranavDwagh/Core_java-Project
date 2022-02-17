package study.threads;

public class MultithreadExample {

	public static void main(String[] args) {
		
		Thread first = new HiThread();
		first.setName("one");
		HelloThread second = new HelloThread();
		second.setName("two");
		/*
		first.run(); //this is single thread  main
		second.run();  //this is same thread main
		*/
		
		Thread third = new HiThread();
		third.setName("three");
		third.start();
		
		first.start();  // this creates a new thread at OS level and adds it to the ready queue
		second.start(); // when the cpu schedular will schedule the thread then run() is executed
		
		System.out.println("main ends ..");
		
	}//end of main thread

} //end of MultithreadExample

class HiThread extends Thread
{
	@Override
	public void run() {
		while(true)
			System.out.println("hi "+ super.getName());
	}//end of run
	
}//end of HiThread class

class HelloThread extends Thread
{
	@Override
	public void run() {
	
		while(true)
			System.out.println("hello "+super.getName());
	
	}//end of run
}//end of HelloThread







