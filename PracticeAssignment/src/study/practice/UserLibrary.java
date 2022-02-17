package study.practice;

public class UserLibrary {
	public static void main(String[] args) {

		Library library = new Library();
		Book book1 = new Book("ABC", "XYZ");
		Book book2 = new Book("PQR", "TRE");
		Book book3 = new Book("EDC", "CVB");
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		
		CompareBook compare = new CompareBook();
		Library library1 = new Library(compare);
		
		library1.add(book1);
		library1.add(book2);
		library1.add(book3);
		
		library.showAllBookInSortedofName();   // sorted using name of book
		library1.showAllBookInSortedofAuthor(); // sorted using author name
		
		
		
		


	}

}
