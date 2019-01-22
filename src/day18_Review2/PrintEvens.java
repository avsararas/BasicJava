package day18_Review2;

public class PrintEvens {
	public static void main(String[] args) {

		int num = 1;

		while (num < 100) {
			
			if (num % 2 == 0) { // Printing even numbers only

				System.out.println(num);
			}
			num++;
		}
	}
}
