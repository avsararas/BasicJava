package day37_ArrayList2;

import java.util.*;

public class ArrayListUpdate {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		nums.add(500);
		
		System.out.println(nums);
		
		nums.set(0, 1000); // replace 100 with 1000

		System.out.println(nums);
		
		nums.set(0, nums.get(0)*2); // first value multiplied by two
		
		System.out.println(nums);
		
		nums.set(nums.indexOf(300), 3); // find 300 and make it 3

		System.out.println(nums);

	}

}
