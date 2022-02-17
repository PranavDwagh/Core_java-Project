package study.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFromTextFileShowOnConsole {

	public static void main(String[] args) throws IOException {
		
		InputStream fin = new FileInputStream("E:\\batches\\Core Java\\IETNOV2021\\gyaan.txt");
		//sc is attached to the file fin
		//Scanner sc = new Scanner(fin);
		/*while(sc.hasNextLine())
			System.out.println(sc.nextLine());
		*/
		
		BufferedReader reader = new BufferedReader(new FileReader("E:\\batches\\Core Java\\IETNOV2021\\gyaan.txt"));
		while(true)
		{
			String s = reader.readLine();
			if(s!=null)
			System.out.println(s);
		}
	}
}
