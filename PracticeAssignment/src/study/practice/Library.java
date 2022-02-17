package study.practice;

import java.util.TreeSet;

public class Library {
	TreeSet<Book> book;
	
	public Library()
	{
		book = new  TreeSet<Book>();
	}

	public Library(CompareBook obj)
	{
		book = new  TreeSet<Book>(obj);
	}
	
	public void showAllBookInSortedofAuthor()
	{
		System.out.println(book);
	}
	public void showAllBookInSortedofName()
	{
		System.out.println(book);
	}
	
	public void add(Book b)
	{
		this.book.add(b);
	}

	public String toString()
	{
		String str = "";
		str =  ""+book;
		return str;
	}


	public TreeSet<Book> getBook() {
		return book;
	}


	public void setBook(TreeSet<Book> book) {
		this.book = book;
	}
	
	
	
	
	
}
