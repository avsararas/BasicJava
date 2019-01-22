package day21_Loops;

public class NestedLoopTask {
	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) { // outer loop prints 10 lines

			for (int i = 1; i <= j; i++) { // inner loop prints numbers side by side

				System.out.print(i+" ");
				
			}

			System.out.println();
		}
		
		// Below makes reverse
		
		
		for (int j = 9; j >= 1; j--) { // outer loop prints 10 lines

			for (int i = 1; i <= j; i++) { // inner loop prints numbers side by side

				System.out.print(i+" ");
				
			}

			System.out.println();
		}
		
		
		for (int j = 2; j <= 10; j++) { // outer loop prints 10 lines

			for (int i = 1; i <= j; i++) { // inner loop prints numbers side by side

				System.out.print(i+" ");
				
			}

			System.out.println();
		}
		
		// Below makes reverse
		
		
		for (int j = 9; j >= 1; j--) { // outer loop prints 10 lines

			for (int i = 1; i <= j; i++) { // inner loop prints numbers side by side

				System.out.print(i+" ");
				
			}

			System.out.println();
		}

	}
}