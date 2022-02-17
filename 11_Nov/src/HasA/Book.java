package HasA;

public class Book {
	
	private String bookName;
	private int cost;
	private String [] author;
	
	
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

	public String toString() {
	
		String str;
		
		str = " Book Name :"+ bookName+ " Cost :"+cost+ " Name of author: "+ getNameinString(author);
		return str;
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
