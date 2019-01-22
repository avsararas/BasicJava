package day11_Swtich;

import java.util.Scanner;

public class Warmup {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Number of Day: ");
		
		int day=keyb.nextInt();
		String dayName, message = ""; //Stings initialized like this
		
		if (day==1) {
			dayName="Monday ";
			message="Turmoil Day";
		}else if (day==2) {
			dayName="Tuesday ";
			message="Java Project";
		}else if (day==3) {
			dayName="Wednesday ";
			message="Group Project";
		}else if (day==4) {
			dayName="Thursday ";
			message="Individual Project";
		}else if (day==5) {
			dayName="Friday ";
			message="Free Day";
		}else if (day==6) {
			dayName="Saturday ";
			message="Java Weekend";
		}else if (day==7) {
			dayName="Sunday ";
			message="Java Weekend";
		}else {
			dayName="Invalid Day Entered \n Good Bye!";
		}
		
	System.out.println(dayName + message);
	
	keyb.close();
	}
}
