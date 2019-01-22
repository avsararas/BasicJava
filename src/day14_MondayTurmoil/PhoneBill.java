package day14_MondayTurmoil;

import java.util.Scanner;

public class PhoneBill {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Enter Number of Calls: ");
		int calls=keyb.nextInt();
		
		double cost=200;
		double r60=0.60;
		double r50=0.50;
		double r40=0.40;
		
		if (calls>200) {
			cost=200+(r60*50)+(r50*50)+(r40*(calls-200));
		
		}else if (calls>150) {
			cost=200+(r60*50)+(r50*(calls-150));
		
		}else if (calls>100){
			cost=200+(r60*(calls-100));
		
		}else {
			cost=200;
		}
		
		System.out.println("Your Number of Calls:"+calls);
		System.out.println("Your Bill is: $"+cost);
	keyb.close();
	}
}
