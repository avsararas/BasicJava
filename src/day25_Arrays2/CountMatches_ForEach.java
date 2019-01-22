package day25_Arrays2;

public class CountMatches_ForEach {
	public static void main(String[] args) {

		double[] price = { 12, 100, 72, 22, 12, 100, 3, 6, 7, 8 };

		// Using For Each loop

		int count = 0;

		for (double cost : price) { // declare cost pulled from price array

			if (cost > 20.0) {
				count++;
			}
		}
		if (count == 0) {

			System.out.println(price.length-count+" items under $20");

		} else {
			System.out.println(count + " items over $20");
			
			System.out.println(price.length-count+" items under $20");

		}
	}
}
