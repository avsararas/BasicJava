package day24_2_Arrays;

public class Arrays_1 {

	public static void main(String[] args) {

//		Arrays are always objects with fixed size
//		Syntax 1: 
//		int[] numbers = new int[3];
//		or
//		int numbers[] = new int[3];
//		
//		Syntax 1: 
//		int number[]= {10,20,30,40};
//		
//		Syntax 1: 
//		int number[]= new int[] {10,20,30,40};
		
		int number[] = new int [5]; // Five numbers only starting from 0
		
		number[0]=10;
		number[1]=20;
		number[2]=30;
		number[3]=40;
		number[4]=50;

		System.out.println(number[2]);
		
		number[2]=number[3]+number[0];
		
		System.out.println(number[2]);

		// Declaring char array and assign A B C D E
		
		char grade[]= {'A','B','C','D','E'};
		
		System.out.println(grade[0]); // will print index number
		
		
		 String city[] = {"Yozgat","Sivas"};
		 
		 System.out.println(city[0]);
		
		
		
		
	}

}
