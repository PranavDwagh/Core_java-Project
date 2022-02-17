package threads;


public class TableThread implements Runnable {
	
	private int x;
	
	public TableThread() {
		x=1;
	}

	public TableThread(int input)
	{
		x=input;
	}
	@Override
	public void run() {
		
		while(x++<2)
		{
			for (int i=1;i<=50;i++)
			{
				for(int j=1; j<=10;j++)
				{
					System.out.println(i+" x "+j+" = "+i*j);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("Interrupt Exception ");
					}
				}
				System.out.println(" ");
			}
		}
		

	}
	


}
