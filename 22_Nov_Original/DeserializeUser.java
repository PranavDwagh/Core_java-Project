package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUser {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("E:\\batches\\Core Java\\IETNOV2021\\students.bingo"));
		
		Object obj = oin.readObject();
		System.out.println(obj);

	}

}
