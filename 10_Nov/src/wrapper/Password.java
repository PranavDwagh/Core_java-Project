package wrapper;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		int attempt =0;

		Scanner sc = new Scanner (System.in);

		while(attempt != 5)
		{
			System.out.println("Enter Your password");
			String password = sc.next();
			System.out.println("Length of password "+password.length() );
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
		boolean z=true, x=true, y=true, w=true , g= true;
		if(password.length()<8 || password.length()>20)
		{
			return false;
		}
		else
		{
			for (int i=0; i<password.length(); i++)
			{
				char a = password.charAt(i);
				//String b = password.charAt(i);
				
	
				if (Character.isLetter(password.charAt(0)))
					g=true;
				
					if (Character.isUpperCase(a) & z!=false)
					{
						z = false;
					    System.out.println("1");
					}
					
					if(Character.isLowerCase(a) && x != false)
					{
						x = false;	
					    System.out.println("2");
					}
				
					if (Character.isDigit(a) && w !=false)
					{
						w = false;
						System.out.println("3");
					}
				
					if (a=='_'||a=='-'|| a== '#'|| a== '$' )
					{
						y = false;
						System.out.println("4");
					}
				}

			}

			if (w == false && x == false && y == false && z == false)
			{
				return true;
			}
			else
			{
				return false;
			}

		}
		
	}





















