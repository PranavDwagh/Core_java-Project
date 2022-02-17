package singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserSinger {
	public static void main(String[] args) {


		List<Singer> list = new ArrayList<Singer>();

		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("1.Add Singer\n2.Remove Singer\n3.Modify Singer Rating\n4.Search Singer By Name\n5.Sort Singer By Name\n6.Display All Singer\n7.Quit\n");
			System.out.println("Enter choice");

			int choice = sc.nextInt();
				
			if (choice == 7)
				break;
			
			
			switch (choice) {
			case 1:
				Singer e = populateSinger();
				list.add(e);
				break;

			case 2:
				System.out.println("Enter Singer Name to Remove");
				String name = sc.next();
				Iterator<Singer> itr = list.iterator();

				while (itr.hasNext())
				{
					Singer tmp = itr.next();
					if(tmp.getName().equals(name))
					{
						itr.remove();
						break;
					}
				}
				break;

			case 6:
				System.out.println("List of singers in the list");
			//	int x1=0;
				for(Singer s : list)
				{
					//System.out.println("Indexx :"+x1);
					//x1++;
					System.out.println(s);
				}
					break;
				// to find index
				// list.indexOf(itr.next());
					
			case 3:
				System.out.println("Enter index of Singer");
			   int ind = sc.nextInt();
				System.out.println("Enter New Rating of Singer in between 1 to 5");
				int rating = sc.nextInt();
				
				list.get(ind).setRating(rating);
				break;
				
			case 4:
				System.out.println("Enter name of singer ");
					name = sc.next();
					Iterator<Singer> itr1 = list.iterator();
					
					while(itr1.hasNext())
					{
						Singer temp = itr1.next();
						if(temp.getName().equals(name))
						{
							System.out.println("print -> "+temp);
							System.out.println("Index ->"+list.indexOf(temp));
						}
					}
					break;
					
			case 5:
					Collections.sort(list, new SortByName());
					for(Singer sn : list)
					{
						System.out.println(sn);
					}
					break;
			default:
				break;
			}
		}

	}

	public static Singer populateSinger() {

		Singer e = new Singer();

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Name of singer ");
		String name = sc.next();
		e.setName(name);
		
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		e.setAge(age);
		
		System.out.println("Enter Gender ");
		char gen = sc.next().charAt(0);
		e.setGen(gen);
		System.out.println("Enter Contact No ");
		String con_No= sc.next();
		e.setContact_no(con_No);
		System.out.println("Set Rating");
		int rating = sc.nextInt();
		try {
			if (rating <0)
			{
				throw new UnderratedRating(); 
			}
			else if(rating >5)
			{
				throw new OverratedRating();
			}
			else
			{
				e.setRating(rating);
			}
		}
		catch (UnderratedRating | OverratedRating e1)
		{
			System.out.println(" Enter Rating in the range of 1 to 5 ");

		}

	//	Singer e = new Singer(name, age, gen, con_No, rating);

		return e;

	}
}
