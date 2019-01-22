package day19_Loops;

public class SnackTime {
	public static void main(String[] args) {

		boolean hungry = true;
		int apples = 1;

		while (hungry) {

			if (apples == 5) {
				hungry = false;
			}
			
			apples++; // We need to put it here to have 5 apples lines to print

			System.out.println("I am eating an apple");

		}
	}
}
