package Assignments;

public class MultiTableLarge {
	public static void main(String[] args) {

		System.out.println("\t\t\t     Multipilcation Table \t");
		for (int k = 0; k < 81; k++) {
			System.out.print("-");
		}
		System.out.println();

		for (int x = 1; x <= 10; x++) {

			if (x == 1) {
				System.out.print("   | ");
			} else {
				System.out.print(" " + (x - 1) + " | ");
			}
			for (int y = 1; y <= 10; y++) {

				if (x == 1) {

					System.out.print(" " + y + "\t| ");

				} else {
					System.out.print(" " + (x - 1) * y + "\t| ");
				}
			}
			System.out.println();

			for (int z = 0; z < 81; z++) {

				System.out.print("-");
			}
			System.out.println();
		}
	}
}