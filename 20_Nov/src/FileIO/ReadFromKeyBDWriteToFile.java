package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFromKeyBDWriteToFile {
	public static void main(String[] args) throws FileNotFoundException {

		OutputStream fout = new FileOutputStream("C:\\Users\\A191\\Desktop\\Core_Java\\Java\\20_Nov\\FileIO.txt",true);                            
		
		PrintWriter pw = new PrintWriter(fout);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
			sc.reset();
			String str =sc.nextLine();
			pw.println(str);
			pw.flush(); 
		}
		pw.close();
	}
}
