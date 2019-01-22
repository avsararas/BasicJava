package day41_Encapsulation;

// Encapsulation is hiding class data by using private variables
// When an instance variable is private, it cannot be accessed form other classes
// Access is granted through GETTER and SETTER

	public class Book {

		private String title; // private makes hidden to other classes
		private String author;
		private int pages;
	

		public String getTitle() { // getter method
			return title;
		}
		public String getAuthor() { // getter method
			return author;
		}
		public int getPages() { // getter method
			return pages;
		}

		public void setTitle(String newTitle) { // setter method
			title = newTitle;
		}
		public void setAuthor(String newAuthor) { // setter method
			author = newAuthor;
		}
		public void setPages(int newPages) { // setter method
			pages = newPages;
		}

}