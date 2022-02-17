package assignment;

import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserPalette {
	public static void main(String[] args) {

		Palette palette = new Palette();
		
		palette.addToPalette("red");
		
		palette.addToPalette("blue");
		
		palette.addToPalette("Yellow");
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Insert Color");
			System.out.println("2. Find Color");
			System.out.println("3. Remove Color");
			System.out.println("4. Show All Colors");
			System.out.println("5. isColor Available ");
			System.out.println("6. Quit");
			
			int choice = sc.nextInt();
			if(choice == 6)
				break;
			
			switch (choice) {
			case 1:
				System.out.println("Enter Color to Add");
				String color = sc.next();
				palette.addToPalette(color);
				break;

			case 2:
				System.out.println("Enter Color to Find");
				String str = sc.next();
				/*palette.searchColor(str);*/
				
				if(palette.searchColor(str))
				System.out.println("Color Found");
				else
					System.out.println("Color not available ");
				 
				break;
				
			case 3:
				System.out.println("Which element you want to remove");
				String remove = sc.next();
				palette.removeColor(remove);
				
			case 4:
				System.out.println("****Below Colors are available in Palette**********");
				
				/*Iterator<String> itr = palette.colors.descendingIterator();
				
				while(itr.hasNext())
					System.out.println(itr.next());          // iterator method
				*/
				
				// using for each method
				
				Stream<String> stream = palette.colors.stream();
				stream.forEach((ele)-> {System.out.println(ele);});
				break;
				
			case 5:
				System.out.println("Enter Color to check");
				String str2 = sc.next();
				boolean res = palette.isColorAvailable(str2);
				if(res)
					System.out.println("Color Available in Set");
				else
					System.out.println("Color not available in set ");
				break;
			default:
				break;
			}
		}
		
	}
}
