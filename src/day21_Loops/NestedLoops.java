package day21_Loops;

public class NestedLoops {
	public static void main(String[] args) {

		for (int j = 1; j <= 3; j++) { // outer loop prints 3 lines

			for (int x = 1; x <= 10; x++) { // inner loop prints numbers side by side

				System.out.print(x + " ");
			}
			
			System.out.println("Line");
		}
		
		System.out.println("End");
	}
}
