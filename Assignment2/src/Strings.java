import java.util.Scanner;
public class Strings {

	public static void main(String[] args) {

		
		String str = new String("Hello with new");
		
		System.out.println(str);
		
		String str2 = "Hello With Literals";
		
		System.out.println(str2);
		
		char [] arr3 = {'h','e','l','l','o'};
		
		String str3 = new String(arr3);
		System.out.println(str3);
		
		char [] arr4 = {'p','r','a','n','a','v',' ', 'w','a','g','h'};
		
		String str4 = new String(arr4, 1, 9);
		System.out.println(str4);
	}



}
