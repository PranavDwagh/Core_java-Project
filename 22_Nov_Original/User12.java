package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import study.collections.MyDate3;

public class User12 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\batches\\Core Java\\IETNOV2021\\students.bingo"));

		Student stud = new Student("prachi",new MyDate3(12,10,2010),9);
		
		oos.writeObject(stud);
		oos.flush();
		
		oos.close();
	}

}
