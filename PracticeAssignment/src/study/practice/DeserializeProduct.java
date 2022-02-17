package study.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;

public class DeserializeProduct {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\Revision\\product.txt"));

		
		for (int i=0; i<3; i++)
		{
			try {
				System.out.println(ooi.readObject());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
