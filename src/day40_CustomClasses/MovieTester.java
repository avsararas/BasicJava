package day40_CustomClasses;

public class MovieTester {
	
	public static void main(String[] args) {
		
		Movie m1= new Movie();
		
		m1.name= "Gora";
	
		m1.length=123;
		
		m1.watch(); // calls behavior from Movie class
		
		m1.buy(3.99); // takes price value here and puts in the class
		
		
		
		
	
	}
}
