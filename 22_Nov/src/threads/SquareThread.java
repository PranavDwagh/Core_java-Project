package threads;

public class SquareThread extends Thread {
	
	private int x;
	
	 public SquareThread() {
		x=1;
	}
	 
	private void SquareThr(int input) {
		x=input;
	}
	
	@Override
	public void run() {

		while(x++<50)
			try {
			sleep(2000);
			System.out.println(super.getName()+" "+x*x);
		} catch (InterruptedException e) {
			
			System.out.println("Interrupt Exception Raised and Cought in Square");
			e.printStackTrace();
		}
	}
	
	

}
