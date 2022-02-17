package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFromKBDWriteTOFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		
		//Writing TEXT data 
		OutputStream fout = new FileOutputStream("E:\\batches\\Core Java\\IETNOV2021\\gyaan.txt",true);
		PrintWriter pw  = new PrintWriter(fout);
		
		for(int i=0;i<5;i++) {
			System.out.println("enter your data");
			String s = sc.nextLine();
			pw.println(s);
			pw.flush(); 
		}
		pw.close();
	}

}
