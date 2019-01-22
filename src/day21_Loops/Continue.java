package day21_Loops;

public class Continue {
	public static void main(String[] args) {
		
		// break and continue keywords in loops
		// break terminates
		// continue will skip the iteration and continue to the next one
		
		for (int i = 1 ; i < 5 ; i++) {
			
			if (i>2) {
				System.out.println(i);
				break;	// stops until 3
			}
		}
		
		for (int num = 0 ; num <= 10 ; num ++) {
			
			if (num == 1 || num == 2) {
				// System.out.println("Value of num " +num); // prints 1 and 2 only

				continue;
				
			}
			System.out.println("Value of num " +num); // prints all but 1 and 2

		}
	}
}
