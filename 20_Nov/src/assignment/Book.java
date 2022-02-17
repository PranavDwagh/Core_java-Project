package assignment;

import java.io.Serializable;

import FileIO.Mydate4;

public class Book implements Serializable {
		
		String name;
		String authorName;
		int cost;
		Mydate4 dateofPublication;
		
		public Book()
		{
			
		}
		
		public Book(String name, String authorName, int cost, Mydate4 dateofPublication) {
			super();
			this.name = name;
			this.authorName = authorName;
			this.cost = cost;
			this.dateofPublication = dateofPublication;
		}
		
		@Override
		public String toString() {
			return "Book [name=" + name + ", authorName=" + authorName + ", cost=" + cost + ", dateofPublication="
					+ dateofPublication + "]";
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public Mydate4 getDateofPublication() {
			return dateofPublication;
		}

		public void setDateofPublication(Mydate4 dateofPublication) {
			this.dateofPublication = dateofPublication;
		}
		
		
		
		
		
		
		
}
