package day33_Methods4;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(get5())); // convert to an array string v1
		
		for (int number : get5()) {
			
			System.out.print(number+" "); // with for each 
		}
		
		
		System.out.println(Arrays.toString(get5e())); // convert to an array string v2
	}

	
// create an array with 5 ints and assigns random nums between 0-100

	public static int[] get5() {

		int nums[] = new int[5];

		Random rand = new Random();

		for (int i = 0; i < nums.length - 1; i++) {

			nums[i] = rand.nextInt(101); // define range for 1 to 100

		}
		return nums;
	}
	
	public static int[] get5e() {
	
	Random rand = new Random();
	
	int nums2[]= {rand.nextInt(101),
				  rand.nextInt(101),
			      rand.nextInt(101),
			      rand.nextInt(101),
	              rand.nextInt(101),
	              };
	
	return nums2;
	}
}