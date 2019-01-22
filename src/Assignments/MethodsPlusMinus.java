package Assignments;

import java.util.Scanner;

public class MethodsPlusMinus {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}
		
		plus_minus(arr);
		
		inp.close();
	}
	
	public static void plus_minus(int ints[]) {
		
		int pos=0;
		int neg=0;
		int zer=0;
		
		for (int i = 0; i < ints.length; i++) {
			
			if (ints[i]>0) {
				pos++;
				
			}else if (ints[i]<0) {
				neg++;
				
			}else {
				zer=zer+1;
			}
		}
		
		System.out.println("positives:"+pos+", negatives:"+neg+", zeros:"+zer);
		
	}
}

