package day26_Arrays3;

public class GetUniqueVals {

	public static void main(String[] args) {
		
//Using a nested loop print only values that appear once(true meaning of unique)	
		
	int nums[] = new int[] {1, 2, 1, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4};
	int numCount=0;
		
		for (int i = 0; i < nums.length; i++) {
									
			boolean duplicate  = false;

			for(int j = 0; j < nums.length; j++) {
								
			if (nums[i]==nums[j] && i !=j) { // outer/inner checks positions to be same
					
					duplicate  = true;
					//break; // breaks from inner loop	
				}
			}
			
			if (duplicate == false) { // it will not print duplicate number and skip
				
				numCount++;
				
				System.out.print(nums[i]+" "); // print each time in the loop	
			}
		}
		
		System.out.println("Unique count is: "+numCount);
	}
}