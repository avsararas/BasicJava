package day27_Arrays4;

import java.util.Scanner;

public class PrintFirstThreeLetters {

	public static void main(String[] args) {

		// Print first 3 letters of entered 5 words

		System.out.println("Please enter 5 words:");
		
		Scanner input = new Scanner(System.in);

		String[] arr = new String[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextLine();
		}

		for (String each : arr) { // with for each loop

			System.out.print(each.substring(0, 3) + ", ");
		}
		
		for (int i = 0; i <arr.length ; i++) { // with for loop
			
			System.out.println(arr[i].substring(0, 3)); // call for string items	
		}
		input.close();
	}
}