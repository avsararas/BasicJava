package day21_Loops;

public class LoopDivisibles5and20 {
	public static void main(String[] args) {
		
		/*
		 * loop through numbers from 1 = 50
		 * print each number in same line , separated by space
		 * if a number is divisible by 5 then skip it
		 * if a number is divisible by 20 then exit the loop
		 */
		
		for (int i = 1; i <= 50; i++) {

			if (i % 5 == 0) {
				continue;
				}
			if (i % 2 == 0) {
				break;
		}
			System.out.print(i+" ");

	}

}
}