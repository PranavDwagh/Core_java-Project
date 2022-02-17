package study.practice;

import java.util.Date;

public class CurrentDateAndTime {
	public static void main(String[] args) throws InterruptedException {

		Thread date =new Thread( new ShowDateAndTime());
		Thread test = new Thread(new Test());
	
		date.start();
		test.setDaemon(true);
		test.start();
		
	//	test.join();    // main will not end until test end
		//date.wait(15);
		System.out.println("main ends");
	}
}

class ShowDateAndTime extends Thread
{
	Date date = new Date();
	@Override
	public void run() {
		int x=0;
		while(x++<10)
		{
			try {
				Thread.sleep(1000);
				System.out.println(date);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Test extends Thread
{
	@Override
	public void run() {
		int x=0;
		while(x++<15)
			try {
				System.out.println("Test Thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}