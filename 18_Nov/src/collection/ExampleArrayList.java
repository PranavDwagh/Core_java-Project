package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ExampleArrayList {
	static int x = 0;
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		while (true)
		{
			System.out.println("********Main Menu**********");
			System.out.println("1.PopulateList");
			System.out.println("2.Remove Element");
			System.out.println("3.Show Element ");
			System.out.println("4.Sum of Elements in List ");
			System.out.println("5.Exit");

			Scanner sc = new Scanner (System.in);
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			if (choice == 5)
			{
				System.out.println("Terminated !!!");
				break;
			}

			switch (choice) {
			case 1:  populatelist(list);
						break;
			case 2:  removeElement(list);
						break;
			case 3:  showElement(list);
						break;
			case 4: int sum = sumofElement(list);
					System.out.println("Sum of total elements in Arraylist "+sum);
						break;
			default:
						break;
			}
		}
	}

	private static int  sumofElement(List<Integer> list) {
		
		int sum =0;
		for (int i=0; i<list.size();i++)
		{
			sum = sum + list.get(i);
		}
		
		
		return sum;
	}

	private static void removeElement(List<Integer> list) {

		System.out.println("Enter Value");
		System.out.println("1. Remove by Index");
		System.out.println(("2. Remove by Value"));

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		if(choice == 1)
		{
			try {
		//	if (x>0)
				if (list.isEmpty())
			{
				System.out.println("Enter Index less than "+(x-1));

				int index = sc.nextInt();
				if(index <=x)
				{
					list.remove(index);
					x--;
				}
			}
			else
			{
				System.out.println("Can't Remove..as there is nothing to remove");
			}
			}
			catch (java.lang.IndexOutOfBoundsException e)
			{
				System.out.println("You have Entered wrong index....try again with correct index");
			}
		}
		

		if(choice == 2)
		{
			if(x>0)
			{
				System.out.println("Enter the Element to remove");
				int element = sc.nextInt();
				Integer obj = new Integer(element);
				if(list.remove(obj))
				x--;
				else
					System.out.println("Enter element not present in Arraylist");
			}
			else
			{
				System.out.println("Can't Remove..as there is nothing to remove");
			}
		}
	}

	private static void showElement(List<Integer> list) {

		System.out.println(list);         // internally calling toString
		for (int i=0; i<list.size(); i++)
		{
			System.out.println("->"+list.get(i));
		}
	}

	public static void populatelist(List<Integer> list) {

		while (true)
		{
			System.out.println("1. Insert......Index and Value Required ");
			System.out.println("2. Append.....only value required ");
			System.out.println("Enter No to Exit");
			Scanner sc = new Scanner(System.in);

			String choice = sc.next();

			if (choice.equalsIgnoreCase("No") || (!choice.equals("1") && (!choice.equalsIgnoreCase("2"))))
				break;

			if (choice.equals("1"))
			{
				System.out.println("Enter Index below "+x);
				int index = sc.nextInt();
				System.out.println("Enter Element to add ");
				int element = sc.nextInt();
				if(index <= x)
				{
					list.add(index, element);
					x++;
				}
				else
				{
					System.out.println("Can't Insert...Wrong index chosen");
				}
			}

			if (choice.equals("2"))
			{
				System.out.println("Enter Element to append");
				int element = sc.nextInt();
				list.add(element);
				x++;
			}
		}

	}




}

