package assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInput {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner (System.in);

		OutputStream fout = new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\20_Nov\\Cities.txt",true);                

		PrintWriter pw = new PrintWriter(fout);
		
		System.out.println("Enter Name of Cities");

		while(true)
		{
			String str = sc.next();
			System.out.println("");
			if(str.equalsIgnoreCase("Quit"))
				break;
			pw.print(str+" \n");
			pw.flush();
		}
	}
}
