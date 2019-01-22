package day41_Encapsulation;


public class Library {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setTitle("Cin Ali Bayirda");
		b1.setAuthor("Salim Yildiran");
		b1.setPages(12);
		
		Book b2 = new Book();
		
		b2.setTitle("Cin Ali Tatilde");
		b2.setAuthor("Salim Yildiran");
		b2.setPages(17);
		
		System.out.println(b1.getTitle()+"'s author "+b1.getAuthor()+" wrote "+b1.getPages()+" pages");
		
		
		System.out.println(b2.getTitle()+"'s author "+b2.getAuthor()+" wrote "+b2.getPages()+" pages");

		
	}
}
