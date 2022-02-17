package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserInvoice {
	
	public static void main(String[] args) {
		
		List<Invoice> invoice = new ArrayList<Invoice>();
		
		invoice.add(new Invoice(new Mydate3(19, 11, 2021), 400, "Ramesh", "Suresh"));
		invoice.add(new Invoice(new Mydate3(17, 9, 1997), 400, "Prakash", "Nilesh"));
		invoice.add(new Invoice(new Mydate3(22, 10, 2022), 600, "Rahul", "Sachin"));
		invoice.add(new Invoice(new Mydate3(1, 12, 2018), 800, "Vishal", "Virat"));
		invoice.add(new Invoice(new Mydate3(15, 8, 1947), 200, "Juned", "Ashwin"));
		invoice.add(new Invoice(new Mydate3(1, 1, 1969), 650, "Satyam", "Mahesh"));
		
		while (true)
		{
			System.out.println("1. Sort Invoice By Date");
			System.out.println("2. Sort by amount indescending Order");
			System.out.println("3. Sort by Invoice given By");
			System.out.println("4. Sorted by invoice given To");
			System.out.println("5. Show Invoice with max value");
			System.out.println("6. Show latest Invoice details");
			System.out.println("7. Quit");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			if (choice == 7)
			{
				System.out.println("Terminated!!");
				break;
			}
			
		switch (choice) {
		case 1:
			
			Collections.sort(invoice);
			show(invoice);
					
			break;
		case 2:
			
				Collections.sort(invoice, new SortAmount());
				/*Iterator<Invoice> iterator = invoice.iterator();
				
				while( iterator.hasNext())
				{
					System.out.println(iterator.next());
				}*/
				
				//invoice.forEach(System.out :: println);
				
				invoice.forEach((e)-> {System.out.println(e);});
				
				break;
			
		case 3:
			
			Collections.sort(invoice, new SortByNameGivenBy());
			//Iterator<Invoice> iterato = invoice.iterator();
			for(Invoice v : invoice)
			{
				System.out.println(v);
			}
			break;
			
		case 4:
			
			Collections.sort(invoice, new SortByNameGivenTo());
			
			Enumeration<Invoice> enume =Collections.enumeration(invoice);
			
			while(enume.hasMoreElements())
			{
				System.out.println(enume.nextElement());
			}
			break;
				
		case 5:
			
			System.out.println("Max Value :"+Collections.max(invoice, new getMaxAmount()));
			
			break;
		case 6:
			
			Collections.sort(invoice);
			/*Iterator< Invoice> itr = invoice.iterator();
			int x=-1;
			while(itr.hasNext())
			{
				itr.next();
				x++;
			}
			System.out.println(invoice.get(x));
			break;*/
			
			 Invoice temp = Collections.max(invoice);
			
			 System.out.println(temp);
			
			break;
			
			
		case 8:
				show(invoice);
				break;
		default:
			break;
		}	
			
		}
		
		
	}//end of main

	private static void show(List<Invoice> Invoice) {
		
		Iterator<Invoice> iterator = Invoice.iterator();
		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}//end of class

class SortAmount implements Comparator<Invoice>
{

	@Override
	public int compare(Invoice o1, Invoice o2) {

		if(o1.getAmount() < o2.getAmount())
			return 1;
		if (o1.getAmount() > o2.getAmount())
			return -1;
		else
			return 0;
	}
	
}

class SortByNameGivenBy implements Comparator<Invoice>
{

	@Override
	public int compare(Invoice o1, Invoice o2) {
		
		return o1.getInvoiceGivenBy().compareTo(o2.getInvoiceGivenBy());
	}
	
}

class SortByNameGivenTo implements Comparator<Invoice>
{

	@Override
	public int compare(Invoice o1, Invoice o2) {

		
		return o1.getInvoiceGivenTo().compareTo(o2.getInvoiceGivenTo());
		
	}
	
}

class getMaxAmount implements Comparator<Invoice>
{

	@Override
	public int compare(Invoice o1, Invoice o2) {
		
		if (o1.getAmount() > o2.getAmount()) return 1;
		if (o1.getAmount() < o2.getAmount()) return -1;
		else
			return 0;
		
	}
	
}

