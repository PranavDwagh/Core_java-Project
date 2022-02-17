import java.util.Scanner;
public class StringMethods {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		while (true)
		{
			System.out.println("Enter Your String Here ");
			String str = sc.next();
			
			
			System.out.println("1. Length of String\n");
			System.out.println("2. Substring\n");
			System.out.println("3. Check Palindrome\n");
			System.out.println("4. Quit\n");
			
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			
			if (choice == 4)
				break;
			
			switch (choice)
			{
			case 1:
				
				int len = str.length();
				System.out.println("Length of String is "+len);
				break;
			
			case 2:
				
				System.out.println("This is your String "+ str);
				
				System.out.println("Enter Start and end point from 0 upto "+str.length()+ "\nStart");
				
				int beginIndex = sc.nextInt();
				System.out.println("End Index");
				int endIndex = sc.nextInt();
			
				 String sub = str.substring(beginIndex-1, endIndex);
				System.out.println(sub);
				
				break;
				
			case 3:
				// Using Array
				/*char [] arr = str.toCharArray();
				boolean flag = true;
				for (int i=0, j= arr.length-1; i<j; i++,j--)
				{
					if (arr[i] != arr[j])
					{
						flag = false;
					}
					
				}
				if (flag == true)
				{
					System.out.println(str+ "is a palindrome");
				}
				else
				{
					System.out.println(str+ " is not a palindrome");
				}
				*/
				
				// Using String Function
				int i, j;
				boolean flag = true;
				for (i=0, j=str.length()-1; i<j; i++,j--)
				{
					if (str.charAt(i) != str.charAt(j))
					{
						flag = false;
					}
				}
				
				if (flag == true)
				{
					System.out.println(str+ "is a palindrome");
				}
				else
				{
					System.out.println(str+ " is not a palindrome");
				}
			}
		}
	}
}
