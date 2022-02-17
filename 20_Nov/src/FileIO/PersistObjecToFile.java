package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class PersistObjecToFile {
	public static void main(String[] args) throws IOException {
		
		Mydate4 date = new Mydate4(17, 9, 1997);           // object which are going to store must have Serializable class
		
		OutputStream fout = new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\ObjStorage.abc",true);
		ObjectOutputStream oop = new ObjectOutputStream(fout);
		
		oop.writeObject(date);
		oop.flush();
		oop.close();
		 
	}

}
