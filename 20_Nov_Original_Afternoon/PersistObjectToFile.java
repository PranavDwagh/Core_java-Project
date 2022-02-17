package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import study.collections.MyDate3;

public class PersistObjectToFile {

	public static void main(String[] args) throws IOException {
		MyDate3 obj = new MyDate3(12, 2, 2000);
		
		OutputStream fout = new FileOutputStream("E:\\batches\\Core Java\\IETNOV2021\\dates.bingo");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}
}
