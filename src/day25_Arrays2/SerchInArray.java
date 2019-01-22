package day25_Arrays2;

public class SerchInArray {
	public static void main(String[] args) {

		// Create array nums and assign 10 numbers
		// search a specific num and print index location if it is not found say so

		int[] num = { 12, 100, 72, 22, 52, 100, 55, 64, 100, 96 };

		boolean found = false;

		for (int i = 0; i < num.length; i++) {

			if (num[i] == 100) {

				System.out.println(num[i]+" found at index " + i);
				found = true; // change it to true
				// break;
			}
		}
		if (found == false) {

			System.out.println("Number not found");
		}
	}
}
