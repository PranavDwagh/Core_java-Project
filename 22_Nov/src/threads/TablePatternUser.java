package threads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TablePatternUser {
	public static void main(String[] args) throws IOException, InterruptedException {

		//OutputStream fout = new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\22_Nov\\Table.txt");

		//	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\22_Nov\\Table.txt"));



		//	PrintWriter pw = new PrintWriter(fout);
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number for Pattern");
		int n = sc.nextInt();
		Thread pattern = new Thread(new Pattern(n));

		Thread table = new Thread(new TableThread1());
		table.start();

		Thread.sleep(3000);

		pattern.start();


		//oos.writeObject(table.start());
	}

}
class TableThread1 implements Runnable {

	private int x;

	public TableThread1() {
		x=1;
	}
	@Override
	public void run() {

		try {
			//OutputStream fout = new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\22_Nov\\Table.txt");
			OutputStream fout = new FileOutputStream("D:\\Table.txt",true);


			PrintWriter pw = new PrintWriter(fout);
			while(x++<2)
			{
				for (int i=1;i<=50;i++)
				{
					for(int j=1; j<=10;j++)
					{
						pw.println(i+" x "+j+" = "+i*j);
						pw.flush();
						//System.out.println(i+" x "+j+" = "+i*j);
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							System.out.println("Interrupt Exception ");
						}
					}
					pw.println(" ");
				}
			}
		}
		catch (FileNotFoundException e1) {

			System.out.println("File Not Found int TableThread 1");
		}
	}
}

class Pattern implements Runnable{

	int x;

	public Pattern(int x) {

		this.x= x;
	}
	
	@Override
	public void run() {
		int y=0;
		while(y<5)
		{
			for(int i=1; i<=x; i++)
			{
				for (int j=1; j<=i; j++)
				{
					System.out.print(j+" ");
				}
				System.out.println("");
			}
			y++;
		}
	}
}