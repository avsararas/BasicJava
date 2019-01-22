package Assignments;

import day20_Loops.ForLoop;

public class ArraysPDF {

	public static void main(String[] args) {
		
		int numeros[] = {1,2,3,4,5,6,7,8,9,10};
		
		int a[]= new int[] {4,5,6};
		
		int b[]= new int[] {a.length};

		System.out.println(b[0]);
		
		//3) print to the console "foo bar" using two positions from this array:
		String[] s_r = new String[] {"foo","hello","bar","world"};
		
		System.out.println(s_r[0]+" "+s_r[2]);
		
		//4)print 2.5 double to the console by adding numbers from this array:
		double[] d_r= new double[] {0.2,0.3,1.0,1.5,2.0};
		
		System.out.println(d_r[4]+d_r[0]+d_r[1]);
		
		//5)loop and print to the console the numbers from this array:
		int[] nums = new int[] {5,4,3,7,8,11};
		
		for (int num : nums) {
			System.out.println(num);
			}
		
		//6)print to console the sum of this int array:
		int[] numbers = new int[] {6,7,11,12,2,3};
		
		int sum1=0;
		
		for (int i : numbers) {
			sum1+=i;	
		}
		System.out.println("Sum is "+sum1);
		
		//7)get biggest number in an int array using loop and print biggest number to console.
		int[] nm = new int[] {60,73,9,15,200,350};
		
		int big=0;
		
		for (int i = 0; i < nm[nm.length]; i++) {
			
			System.out.println(i);
		}

		
		
		
		
		
	
				

		

		
		
	
	}

}
