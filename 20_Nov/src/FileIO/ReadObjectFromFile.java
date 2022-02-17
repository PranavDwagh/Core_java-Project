package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObjectFromFile {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		InputStream fin = new FileInputStream("C:\\Users\\A191\\Desktop\\Core_Java\\ObjStorage.abc");
		
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Object obj = oin.readObject();
		System.out.println(obj);
		 
	}

}
