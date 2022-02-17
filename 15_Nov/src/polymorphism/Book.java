package polymorphism;

public class Book {
	
	private String bookName;
	private int cost;
	 String [] author;
	
	
	public Book()
	{
		bookName = "Unknown";
		cost = 0;
		author= new String [0];
	}
	
	public Book(int c, String name, String [] arr)
	{
		bookName = name;
		cost = c;
		author = arr;
	}
@Override
	public String toString() {
	
		String str;
		
		str = " Book Name :"+ bookName+ " Cost :"+cost+ " Name of author: "+ getNameinString(author);
		return str;
	}

	@Override
	public boolean equals(Object obj)
	{
		Book b =(Book)obj;
		if(this.getBookName()==b.getBookName() && this.getCost() == b.getCost())
		{
			int x = (this.author.length>b.author.length) ? this.author.length : b.author.length;
			System.out.println("Value of X :"+x);
			System.out.println("this author length "+ this.author.length);
			System.out.println("B author length "+ b.author.length);
			
			if (this.author.length != b.author.length)
				return false;
			
			else
			{
			for(int i =0; i<x;i++)
			{
				if(!this.author[i].equals(b.author[i]))
				{
					System.out.println("In If");
					return false;
				}
				else
				{
					System.out.println("In Else");
					
				}
			}
			return true;
		}
		}
		else
			return false;
	}

	public String getNameinString(String [] arr) {
		String str = "";
		for(int i=0; i<arr.length;i++)
		{
			str += (arr[i])+" ";
		}
		return str;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	
}
