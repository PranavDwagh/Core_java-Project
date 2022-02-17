import java.util.Scanner;
public class StringBuffer_2 {
	public static void main(String[] args) {

		String str = "pranav";
		String str2 = str.concat(" wagh");

		StringBuffer bff = new StringBuffer();
		bff.append("pranav");

		StringBuffer cff = new StringBuffer();
		cff = bff.append("wagh");

		System.out.println("str-->"+str);
		
		System.out.println("str2 -->"+str2);
		if (str == str2)
		{
			System.out.println("String str and String str2 having same address");
			
		}
		else
		{
			System.out.println("String str and String str2 having different address");

		}
		if(bff == cff)
		{
			System.out.println("bff and cff having same address");
		}
		else
		{
			System.out.println("bff and cff has diff address");
		}



	}
}
