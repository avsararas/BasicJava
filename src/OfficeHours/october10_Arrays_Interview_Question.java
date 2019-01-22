package OfficeHours;

public class october10_Arrays_Interview_Question {
	
	public static void main(String[] args) {
		
		//Given array of int and given target number
		//Print indexes of sum totaling the target int number defined
		
		int arr[] = {1,4,5,9,3,7};
		
		int targetNumber = 7; // defined here
		
		for(int i=0; i < arr.length ; i++) {
			
			for(int j=i+1; j < arr.length ; j++) {
				
                if(arr[i] + arr[j] == targetNumber) {   
					
					System.out.println(i +", "+j);					
				}
				
				
			}
			
		}
			
	
	}

}
