package study.practice;

import java.util.Scanner;

public class ReverseLineLikeTac {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your string here ");
		String str = sc.nextLine();

		String [] arr = str.split(" ");

		for (int i=arr.length-1 ; i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
