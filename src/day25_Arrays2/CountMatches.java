package day25_Arrays2;

public class CountMatches {

	public static void main(String[] args) {
		// Create a double array of prices
		// Count how many items more than $20

		boolean found = false;

		int count = 0;

		double[] price = { 12, 100, 72, 22, 12, 100, 3, 6, 7, 8 };
		
		// Using for loop

		for (int i = 0; i < price.length; i++) {

			if (price[i] >= 20) {

				count++;

				found = true; // change it to true
				// break;
			}
		}
		if (found == false) {

			System.out.println("Number not found");
		}

		System.out.println(count + " items found over $20");
	}
}
