package day20_Loops;

public class Accumulator {
	public static void main(String[] args) {

		int sumodd = 0;
		int sumeven = 0;

		for (int x = 0; x <= 20; x++) {

			if (x % 2 == 0) {
				sumeven = sumeven + x; // adding all even numbers
			} else {
				sumodd = sumodd + x; // adding all odd numbers
			}
		}
		System.out.println("Sum of odds: " + sumodd);
		System.out.println("Sum of evens: " + sumeven);

	}
}
