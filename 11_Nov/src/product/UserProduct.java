package product;

import java.util.Scanner;

public class UserProduct {
	public static void main(String[] args) {

		Product [] product = new Product[5];
		
		product[0] = new Product("Mobile", "8GB Ram 128GB",500, new Date(25, 11, 2021));
		product[1] = new Product("Laptop", "16GB Ram 512GB",1000, new Date(01, 1, 2022));
		product[2] = new Product ("Alexa", "5GB Ram 100GB",600, new Date(10, 11, 2019));
		product[3] = new Product("Mouse", "8GB Ram 128GB",500, new Date(20, 10, 2021));
		product[4] = new Product("PS5", "8GB Ram 500GB",200, new Date(10, 11, 2021));
		
		Scanner sc =new Scanner (System.in);
		
		for (int i=0; i<product.length;i++) 
		{
			System.out.println(product[i]);
		}
		System.out.println("Enter What would you like to buy");
		
		String prod = sc.next();
		System.out.println("Enter no of unit you are willing to purchase");
		int n = sc.nextInt();
		if(prod.equals("Mobile"))
		{
			boolean res=true;

			res = checkExp(product[0].doe);
			if (res)
			{
			System.out.println("Your Bill");
			int Cost = n * product[0].cost;
			System.out.println("Total Cost:"+Cost);
			System.out.println("Product Name: "+product[0].productName+" Product Description :"+product[0].desc+ " Quantity" +n );
			}
			else
			{
				System.out.println("Product is Expired We cannot Sell it");
			}
		}
		if(prod.equals("Laptop"))
		{
			boolean res=true;

			res = checkExp(product[1].doe);
			if (res)
			{
			System.out.println("Your Bill");
			int Cost = n * product[1].cost;
			System.out.println("Total Cost:"+Cost);
			System.out.println("Product Name: "+product[1].productName+" Product Description :"+product[1].desc+ " Quantity" +n );
			}
			else
			{
				System.out.println("Product is Expires We cannot Sell it");
			}
		}
		if(prod.equals("Alexa"))
		{
			boolean res=true;

			res = checkExp(product[2].doe);
			if (res)
			{
			System.out.println("Your Bill");
			int Cost = n * product[2].cost;
			System.out.println("Total Cost:"+Cost);
			System.out.println("Product Name: "+product[2].productName+" Product Description :"+product[2].desc+ " Quantity" +n );
			}
			else
			{
				System.out.println("Product is Expires We cannot Sell it");
			}
		}
		if(prod.equals("Mouse"))
		{
			boolean res=true;

			res = checkExp(product[3].doe);
			if (res)
			{
			System.out.println("Your Bill");
			int Cost = n * product[3].cost;
			System.out.println("Total Cost:"+Cost);
			System.out.println("Product Name: "+product[3].productName+" Product Description :"+product[3].desc+ " Quantity" +n );
			}
			else
			{
				System.out.println("Product is Expires We cannot Sell it");
			}
		}
		if(prod.equals("PS5"))
		{
			boolean res=true;

			res = checkExp(product[4].doe);
			if (res)
			{
			System.out.println("Your Bill");
			int Cost = n * product[4].cost;
			System.out.println("Total Cost:"+Cost);
			System.out.println("Product Name: "+product[4].productName+" Product Description :"+product[4].desc+ " Quantity" +n );
			}
			else
			{
				System.out.println("Product is Expires We cannot Sell it");
			}
		}
	}

	private static boolean checkExp(Date doe) {
		
		System.out.println("Enter Todays Date");
		
		Scanner sc = new Scanner (System.in);
		int d = sc.nextInt();
		System.out.println("Enter Month");
		int m = sc.nextInt();
		System.out.println("Enter year");
		int y = sc.nextInt();
		
		if ((doe.year-y) > 0)
			return true;
		else if((doe.month-m) > 0)
			return true;
		else if ((doe.month == m))
		{
			if((doe.day-d) >0)
			return true;
		}

		return false;
	}
	
}
