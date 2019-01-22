package day45_Blocks;

public class BlocksTest {
	public static void main(String[] args) {
		
		System.out.println(Blocks.num); // 1100
		System.out.println(Blocks.str);
		
		Blocks b1 = new Blocks(); // 3200 new object
		
		System.out.println(b1.num);
		System.out.println(b1.str);
		
		Blocks b2 = new Blocks(); // 7400 another new object
		
		System.out.println(b2.num);
		System.out.println(b2.str);
		
		Blocks b3 = new Blocks(); // 15800 another new object
		
		System.out.println(b2.num);
		System.out.println(b2.str);
	}

}
