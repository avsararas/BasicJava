package day25_Arrays2;

public class ArrayPrintReverse {
	public static void main(String[] args) {

		// Count scores from reverse with for loop

		int score[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		if (score.length == 10) {

			System.out.println("We have 10 scores entered: \n");

			System.out.println( "For Loop: \n");

			
			for (int i = score.length - 1; i >= 0; i--) { // -1 is needed because max is 9

				System.out.print(score[i] + " ");
			}

		} else {
			System.out.println("We need 10 scores!");
		}

		// Count scores from reverse with while loop

		int index = score.length - 1; // -1 is needed because max is 9

		System.out.println( "\n\nWhile Loop: \n");
		
		while (index >= 0) {

			System.out.print(score[index] + " "); // also score[index--]

			index--;
		}
	}
}
