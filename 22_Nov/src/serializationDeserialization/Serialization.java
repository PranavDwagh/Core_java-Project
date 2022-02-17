package serializationDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\22_Nov\\src\\serialize.txt"));
		
		Employee e = new Employee(500, "Pranav");
		
		for (int i = 0; i < 10; i++) {
			oos.writeObject(e+" "+i);
			oos.flush();
		}
		
		oos.close();
				
		
	}
	
	
}
