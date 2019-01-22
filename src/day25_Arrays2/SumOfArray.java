package day25_Arrays2;

public class SumOfArray {
	public static void main(String[] args) {
		
		int array[] = { 12, 100, 72, 22, 52, 100, 55, 64, 100, 96 };

		int sum=0;
		int evens=0;
		int odds=0;
		
		for (int i : array) {
			
			sum = sum+i; // or sum +=i
			
			// small = i < small ? i : small; // Ternary version
			
			if (i%2==0) {
				evens+=i;
				
			}else {
				odds+=i;
			}
		}
		
		System.out.println("Grand Total: "+sum);
		
		System.out.println("Evens Total: "+evens);
		
		System.out.println("Odds Total: "+odds);
		
	}
}
