package day25_Arrays2;

public class FindSmallest {
	public static void main(String[] args) {
		
		// Find the smallest value in an array
		
		int array[] = { 12, 100, 72, 22, 52, 100, 55, 64, 100, 96 };
		
		int small=array[0];
		
		for (int n : array) { // each n inside the array
			
			if (n<small) {
				small=n;
			}
		}
		
		System.out.print("Smallest number is: ");

		System.out.println(small);
		
		
	}

}
