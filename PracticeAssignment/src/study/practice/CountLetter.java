package study.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountLetter {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your String here");
		String str = sc.nextLine();
		//List<String> list = new ArrayList<String>();
		
		String [] arr = str.split(" ");
		int x=0;
		char [] arr1 = str.toCharArray();
		for (int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
					x++;
			}
//			if(Character.isSpaceChar(' '))
//			{
//				x++;
//			}
//			
		}
		System.out.println("No of Word in the line "+(x+1));

		int count = 0;
		
		for (int i=0; i<str.length();i++)
		{
			if(Character.isLetter(arr1[i]))
			{
					count ++;
			}
		}
		System.out.println("No of characters in the line "+(count));
		
		
		
	}

}
