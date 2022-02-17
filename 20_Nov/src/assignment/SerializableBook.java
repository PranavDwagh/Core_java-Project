package assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import FileIO.Mydate4;

public class SerializableBook {
	
	public static void main(String[] args) throws IOException {
		
		Book book1 = new Book("ABC", "XYZ", 100, new Mydate4(20, 11, 2020));
		Book book2 = new Book("PQR", "PDW", 500, new Mydate4(21, 11, 2019));
		Book book3 = new Book("MNP", "ASD", 400, new Mydate4(2, 1, 2021));
		Book book4 = new Book("TOM", "EDC", 300, new Mydate4(20, 11, 2021));
		Book book5 = new Book("BOM", "VFR", 200, new Mydate4(10, 1, 2022));
		
		OutputStream fout = new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\20_Nov\\books.txt");
		ObjectOutputStream oop = new ObjectOutputStream(fout);
		
			oop.writeObject(book1+"\n");
			oop.flush();
			
			oop.writeObject(book2+"\n");
			oop.flush();
			oop.writeObject(book3+"\n");
			oop.flush();
			oop.writeObject(book4+"\n");
			oop.flush();
			oop.writeObject(book5+"\n");
			oop.flush();
		
			oop.close();
	}

}
