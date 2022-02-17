package revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentIOOPeration {

	public static  void WriteToFile(List<Student> student)  {

		ObjectOutputStream oop;
		try {
			oop = new ObjectOutputStream (new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\Revision\\src\\revision\\Student.txt"));
			Iterator<Student> itr = student.iterator();

			while(itr.hasNext())
			{
				Student stud = itr.next();
				oop.writeObject(stud);
			}

			oop.flush();
			oop.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public  static List<Student> readFromFile()
	{
		List<Student> student = new ArrayList<Student>();
		ObjectInputStream obj = null;
		
		try
		{
			FileInputStream fin  = new FileInputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\Revision\\src\\revision\\Student.txt");
		
			obj = new ObjectInputStream(fin);
			
			while(fin.available()>0)

			{
				Student stud = (Student) obj.readObject();
				student.add(stud);
			}
		}
		catch(FileNotFoundException f)
		{
			try {
				throw new StudentDBFileNotFound();
			} catch (StudentDBFileNotFound e) {
				
				System.out.println(e.getMessage());
			}
		}
		catch(IOException | ClassNotFoundException i)
		{
			System.out.println(i);
		}
		finally {
			
			try {
				if (obj != null)
				obj.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
		
	}
	}



