package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class UserNamePwdHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> login = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		int x=0;
		while(x++<5)
		{
			System.out.println("Enter User ID");
			
			String id = sc.next();
			System.out.println("Enter Password");
			
			String password = sc.next();
			
			login.put(id, password);
		}
		
		System.out.println(login);
		
		System.out.println("*****Login*******");
		
		
		 while(true)
		 {
			 System.out.println("Enter User ID");
			 String inID = sc.next();
			 System.out.println("Enter PassWord");
			 String pass = sc.next();
			if(login.containsKey(inID))
			 {
				if(login.containsValue(pass))
				{
					System.out.println("Welcome "+inID);
					break;
				}
				else
				{
					System.out.println("Wrong Password for "+inID);
					break;
				}
			 }
			else
			{
				System.out.println("Wrong UserID :"+inID);
				break;
			}
		 }
	}
}
