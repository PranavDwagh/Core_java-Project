package study.threads;

public class RunnableLamdaExample {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()-> { while(true) System.out.println("hi");});
		t1.start();
		
		new Thread(()->{while(true) System.out.println("dingdong");}).start();
	}
	
}
