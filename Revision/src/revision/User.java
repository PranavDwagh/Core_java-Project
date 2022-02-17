package revision;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		List<Student> student = null;

		student = StudentIOOPeration.readFromFile();

		//		try
		//		{
		//		student = StudentIOOPeration.readFromFile();
		//		}
		//		catch(StudentDBFileNotFound e)
		//    	{
		//			student = new ArrayList<Student>();
		//		}

		boolean flag = true;
		while (true)
		{
			showmenu();
			System.out.println("Enter Your Choice ");
			int choice = sc.nextInt();

			switch (choice) {

			case 0:

				Iterator<Student> itr = student.iterator();

				try
				{
					while(itr.hasNext())
					{
						System.out.println(itr.next());
					}
				}
				catch (java.lang.NullPointerException e)
				{
					System.out.println("Null Pointer Exception ");
					break;
				}
				
				break;
				
				
			case 1:
				Student s1 = populateStudent(student,sc);
				student.add(s1);
				
				break;
				
			case 2:
				Student s2 = populatestudent1(student, sc);
				student.add(s2);
				break;
				
			case 3:
				
				System.out.println("Enter Name of Student");
				String name = sc.next();
				Iterator<Student> itr1 = student.iterator();
				try
				{
					while(itr1.hasNext())
					{
						Student temp = itr1.next();
						if (temp.getName().equals(name))
						System.out.println(temp);
					}
				}
				catch (java.lang.NullPointerException e)
				{
					System.out.println("Null Pointer Exception ");
					break;
				}
				break;
				
			case 4:
				
				System.out.println("Enter name of Student");
				String name1 = sc.next();
				/*
				for (Iterator<Student> iterator = student.iterator(); iterator.hasNext();)
				{
					Student temp = iterator.next();
					if (temp.getName().equals(name1))
					iterator.remove();
				}*/
				
				for (int i=0; i<student.size();i++)
				{
					if (student.get(i).getName().equals(name1))
					student.remove(i);
				}
				
				break;
				
			case 5:
				System.out.println("Caution...All Student data will be erased");
				
				student.removeAll(student);
				
				
			case 6:
				
				System.out.println("Exited Without Save");
				flag = false;
				break;
				
			case 7:
				StudentIOOPeration.WriteToFile(student);
				flag = false;
				break;
			}

		}

	}//end of main

	private static Student populateStudent(List<Student> student, Scanner sc) {
		
		System.out.println("Enter name of student");
		String name = sc.next();

		System.out.println("Enter age of student");
		int age = sc.nextInt();
		
		System.out.println("Enter Marks of Student");
		
		int [] arr = new int [3];
		
		for(int i=0; i<arr.length ;i++)
		{
			arr[i] = sc.nextInt();
		}
		Student s = new Student(name, age, arr);

		return s;
		
	}

	private static Student populatestudent1(List<Student> student, Scanner sc) {


		System.out.println("Enter name of student");
		String name = sc.next();

		System.out.println("Enter age of student");
		int age = sc.nextInt();

		Student s = new Student(name, age);

		return s;
	}

	private static void showmenu() {

		System.out.println("*********Menu***********");
		System.out.println("0.Show all Student");
		System.out.println("1. Add Student");
		System.out.println("2. Add Student Without Mark");
		System.out.println("3. Get Student by name");
		System.out.println("4. Remove Student");
		System.out.println("5. Remove all Student");
		System.out.println("6. Exit Without Save");
		System.out.println("7. Save and Exit");


	}

}//end of class
