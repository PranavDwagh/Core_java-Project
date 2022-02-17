package wrapper;
import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {

		int attempt =0;

		Scanner sc = new Scanner (System.in);
		

		while(attempt != 5)
		{
			System.out.println("Enter Your password");
			String password = sc.next();
			boolean res= verify(password);

			if(res == true)
			{
				System.out.println("Congrats your password is set");
				break;
			}

			else
			{
				if(attempt==4)
				{
					attempt++;
					System.out.println("Your run out of attempts");
				}
				else
				{
				attempt++;
				System.out.println("Password is invalid....enter your password again ");
				}
			}
		}
	}
	/*
	 * 1. The password length must be between 8 and 20
					2. The password must begin with a letter 
					3. The password must have at least one capital character
					4. The password must have at least one digit 
					5. The password must have at least one small character
					6. The password must have at least one special char ====>>>       _   -  #  $
	 */

	private static boolean verify(String password) 
	{
		int z=0, x=0, y=0, w=0;
		if(password.length()<8 || password.length()>20)
		{
			return false;
		}
		else if((password.charAt(0) <'A' || password.charAt(0)>'z'))
		{
			return false;
		}
		else
		{
			for (int i=0; i<password.length(); i++)
			{
				char a = password.charAt(i);
				
				if (z<1)
				{
					if (a > 'A' || a<'Z')
						z++;
				}
				if(x<1)
				{
					if (a > 'a' || a<'z')
						x++;	
				}
				if(w<1)
				{
					int p = (int) a;
					
				}

			}



		}
		
		return true;
	}


}


















