package HasA;

import java.util.Scanner;

public class UserBook {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter No of Books");
		
		int n = sc.nextInt();
		
		Book [] book = new Book [n];
		
		populateBook(book);
		
		showBook1Author(book);
		
		//to display all the books and their properties
		for(int i=0; i<book.length;i++)
		{
			System.out.println(book[i]);
		}
		
		// To get total cost of book in array first feed all values to array
		
		int[] arr = new int[n];
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			sum=sum+ book[i].getCost();
		}
		System.out.println("Commulative cost of all the books is :"+ sum);
			System.out.println("Below are list of all authors ");
		for(int i=0; i<book.length;i++)
		{
			System.out.println(book[i].getNameinString(book[i].getAuthor()));
		}
	}

	private static void showBook1Author(Book[] book) {
		
		for(int i=0; i<book.length;i++)
		{
			if(book[i].getAuthor().length==1)
			{
				System.out.println(book[i].getBookName()+" has only one author ");
			}
		}
	}

	private static void populateBook(Book[] book) {
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<book.length; i++)
		{
		System.out.println("*****Populate Book*****");
		
		System.out.println("Enter Name of the book");
		String name = sc.next();
		
		System.out.println("Enter Cost of book");
		int cost= sc.nextInt();
		
		System.out.println("Enter No of authers of the book");
		int n = sc.nextInt();
		System.out.println("Enter Author names");
		String []arr= new String [n];
		for(int k=0; k<arr.length;k++)
		{
			
			arr[k] = sc.next();
		}
		
		book[i] = new Book(cost, name, arr);
	}
}
}
