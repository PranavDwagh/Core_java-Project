package polymorphism.interference;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many product you want to buy ");
		int n = sc.nextInt();
		Product [] shopping = new Product[n];
		/*
		for(int i=0; i<shopping.length; i++)
		{
			populateObject(shopping[i]);   //100
		}*/
		
		
		for(int i=0; i<shopping.length; i++)
		{
			System.out.println("Enter what you want to buy Press 1 for Toy and Press 2 For Dress ");
			int choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.println("Enter Name of the Toy ");
				String name = sc.next();
				System.out.println("Enter Category of Toy ");
				String cat = sc.next();
				System.out.println("Enter Cost of Toy ");
				int cost = sc.nextInt();

				Toy t = new Toy(name, cat, cost);
				shopping[i] = t;
			}

			else if( choice == 2)
			{
				System.out.println("Enter name of dress");
				String name = sc.next();
				System.out.println("Enter material of dress ");
				String material = sc.next();
				System.out.println("Enter Size");
				char size = sc.next().charAt(0);
				System.out.println("Enter Prize of dress");
				int prize  = sc.nextInt();

				Dress d = new Dress(name, material, size, prize);

				shopping[i] = d;
			}

		}
		showbill(shopping);   // generating bill
	}//End of main

	private static void showbill(Product[] shopping) {

		System.out.println("*******Your Bill********");
		for(int i=0; i<shopping.length;i++)
		{
			System.out.println(shopping[i].getdesc());            //here you can use to string as well but in question its mention
		}															// getdesc is absttract method returning toString of each object
		
		int sum = 0;
		for(int i=0; i<shopping.length;i++)
		{
			sum = sum + shopping[i].getFinalCost();        // getfinal cost is abstract method returning cost
		}														// abstract method do not required typecast and instanceof
		System.out.println(" Total Bill : "+sum);
		
	}

	/*
	public static void  populateObject(Product shopping )    // shopping = 200
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter what you want to buy Press 1 for Toy and Press 2 For Dress ");
	int choice = sc.nextInt();
	if(choice == 1)
	{
		System.out.println("Enter Name of the Toy ");
		String name = sc.next();
		System.out.println("Enter Category of Toy ");
		String cat = sc.next();
		System.out.println("Enter Cost of Toy ");
		int cost = sc.nextInt();

		Toy t = new Toy(name, cat, cost);    //// toy =200
		shopping = t;                         
	}

	else if( choice == 2)
	{
		System.out.println("Enter name of dress");
		String name = sc.next();
		System.out.println("Enter material of dress ");
		String material = sc.next();
		System.out.println("Enter Size");
		char size = sc.next().charAt(0);
		System.out.println("Enter Prize of dress");
		int prize  = sc.nextInt();

		Dress d = new Dress(name, material, size, prize);

		shopping = d;
	}
	}*/
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	











































