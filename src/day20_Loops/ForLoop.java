package day20_Loops;

public class ForLoop {
	public static void main(String[] args) {

		// (initialization ; termination ; increment)

		for (int i = 1; i <= 5; i++) {

			System.out.println("Zart Zurt Zord! "+i); // Iteration

		}
		
		for (int i = 5; i <= 25; i+=5) { // increments of 5

			System.out.println("Cart Curt! "+i); // Iteration

		}
		int sum=0;
		for (int i = 1; i <= 5; i++) {
			
			 sum=sum+i; // or sum+=i; for shorter
		}
		System.out.println("Sum is "+sum); // Printing the sum of all numbers
		
	
	}
}
