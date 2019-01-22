package day33_Methods4;

public class ArraySums {

	public static void main(String[] args) {

	System.out.println(max());
	
	}

// Create 2 arrays using get5 method and compare both arrays sums

	public static int max() {

		int[] arr1 = ArrayMethods.get5();
		int[] arr2 = ArrayMethods.get5();

		int sum1 = 0;
		int sum2 = 0;

		int max = 0;

		for (int num : arr1) {
			sum1 += num;
		}
		for (int num : arr2) {
			sum2 += num;
		}

		if (sum1 > sum2) {

			max = sum1;

		} else if (sum1 == sum2) {

			max = sum1;

		} else {

			max = sum2;
		}
		return max;
	}

}
