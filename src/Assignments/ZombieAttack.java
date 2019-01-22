package Assignments;

import java.util.Arrays;

import java.util.Scanner;

public class ZombieAttack {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] inhabitants = new int[8];
		
		for (int i = 0; i < inhabitants.length; i++) {
		
		inhabitants[i] = input.nextInt();
		}
		
		
		for (int i = 7; i > 0 ; i--) {
			
			inhabitants[i]=inhabitants[i]/2;
			
			System.out.println(Arrays.toString(inhabitants));

			
		}
		
		
		
		
		
		
		

		input.close();
	}
}
