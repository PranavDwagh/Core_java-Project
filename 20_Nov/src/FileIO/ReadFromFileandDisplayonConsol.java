package FileIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFromFileandDisplayonConsol {
	public static void main(String[] args) throws IOException {
			
		//InputStream fin = new FileInputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\20_Nov\\FileIO.txt"); 
		
		/*
		Scanner sc = new Scanner(fin);
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());          // one method of reading text file 
		*/
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\20_Nov\\FileIO.txt"));
		
		while (true)
		{ 
			String str =reader.readLine();
			if (str!= null)
			System.out.println(str);
		}
		
	}
}
