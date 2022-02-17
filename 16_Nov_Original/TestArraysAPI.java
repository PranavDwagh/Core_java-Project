package study;

import java.util.Arrays;

public class TestArraysAPI {

	public static void main(String[] args) {
		
		String[] authors = new String[] {"gosling","kerninghan","ritchie" };
		
		String[] authors2 = new String[] {"gosling","kerninghan","ritchie" };
		/*
		 * new String[3]; authors2[0] = "gambhir"; authors2[1] = "save"; authors2[2]
		 * ="kulkarni";
		 */
		boolean result = Arrays.equals(authors, authors2);
		
		if(result)
		{
			System.out.println("arrays are same");
		}
		else
			System.out.println("arrays are different");
		
		
		

	}

}
