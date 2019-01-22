package day45_Blocks;

public class InitBlockTest {
	
	public static void main(String[] args) {
		
		InitBlockClass.staticMethod(); // Runs once when object created
		
		InitBlockClass one = new InitBlockClass();
		InitBlockClass two = new InitBlockClass();
		InitBlockClass three = new InitBlockClass();
		
		Blocks b1 = new Blocks();
		Blocks b2 = new Blocks();
		
		System.out.println(b1.num);
		System.out.println(b1.str);

		System.out.println(b2.num);
		System.out.println(b2.str);
		

	}

}
