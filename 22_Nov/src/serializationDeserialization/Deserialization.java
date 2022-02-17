package serializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\22_Nov\\src\\serialize.txt"));

		while(ois.available() == 0)
		{
			try
			{
				Object obj = ois.readObject();
			
				System.out.println(obj);
			}
			catch (java.io.EOFException e)
			{
				System.out.println("End of file reached !!");
				break;
			}
		}
		
	}

}
