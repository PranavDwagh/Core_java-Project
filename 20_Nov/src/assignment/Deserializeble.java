package assignment;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Deserializeble {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		InputStream in = new FileInputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\20_Nov\\books.txt");
		
		ObjectInputStream oop = new ObjectInputStream(in);
		
		/*for(int i=0; i<5;i++)
		{
		Object obj = oop.readObject();            // this is one way
		System.out.println(obj);
		
		}
		*/
		while(true)         // this is another way
		{
			try {
				Object obj = oop.readObject();
				System.out.println(obj);
				
			}
			catch (EOFException e) {
				System.out.println("Terminated!!");
				break;
			}
		}
	}
}
