package day36_ArrayList;

import java.util.ArrayList;

public class WrapperArrayListValues {
	public static void main(String[] args) {
		
		Integer n =100;
		
		// n. will show options
		
		// Below will take primitives in Array Lists
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(234);
		nums.add(3);
		nums.add(5745);
		nums.add(43);
		nums.add(879);
		
		System.out.println(nums);
		
		// for each loop print out
		
		for (Integer num : nums) {
			System.out.println(num);
		}
		
		// for loop
		
		for (int i = 0; i < nums.size(); i++) {
			
			System.out.print(nums.get(i)+" "); // like methods .get is to search index in AL
		}
		
	}

}
