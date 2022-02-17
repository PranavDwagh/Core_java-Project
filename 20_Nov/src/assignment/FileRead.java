package assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) throws IOException {

		//InputStream fin = new FileInputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\20_Nov\\Cities.txt");   

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\20_Nov\\Cities.txt"));

		List<String> list = new ArrayList<String>();

		String str2= "";
		int x=0;
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			String str = reader.readLine();
			if(str == null)
				break;
			x++;
			list.add(str);
		}

		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Count of Cities");
			System.out.println("2. Cities in Sorted Order\n3. Quit");

			int choice = sc.nextInt();

			if (choice == 3)
				break;

			switch (choice) {
			case 1:

				System.out.println("No of Cities in File are :"+x);

				break;

			case 2:

				Collections.sort(list);

				Iterator<String> itr =list.iterator();

				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}

				break;
			default:
				break;
			}
		}
	}
}
