package WarmUps;

public class Day26_Arrays {
	public static void main(String[] args) {
		
// Using a Loop write some code to do the following:
// if the value is even - double it and assign back.
// If the value is odd - triple it and assign back.	  
		
		int nums[] = {1,2,3,4,5,6,7,8,9};		
				
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i]%2 == 0) {
				
				nums[i]= nums[i]*2;
			}else {
				
				nums[i]= nums[i]*3;
			}
		}
		
		// nums[i] = (nums[i]%2 == 0)? nums[i]*2 : nums[i]*3; // Ternary Version
		
		for (int n : nums) { // loop through each updated number and show
			
			System.out.print(n+" ");
			
		}
		System.out.println();
		
		System.out.print(nums[nums.length-1]); // last updated number

	}
}
