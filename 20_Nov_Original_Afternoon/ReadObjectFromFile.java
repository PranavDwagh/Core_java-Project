package study.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("E:\\batches\\Core Java\\IETNOV2021\\dates.bingo");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Object obj = oin.readObject();
		System.out.println(obj);

	}

}
