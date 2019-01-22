package Assignments;

import java.util.Scanner;

public class Methods9_IsPos {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {

			isPos(arr[i]); // important to check i of arr array
		}
		inp.close();
	}

	public static void isPos(int num) {

		if (num <= 0) {

			System.out.println("not positive");
		} else {
			System.out.println("positive");
		}
	}
}