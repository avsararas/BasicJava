package day09_Conditionals3;

import java.util.Scanner;

public class CreditScore {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
		
		System.out.println("Enter Credit Score: ");
		
		int score=keyb.nextInt();
		String finalscore="No Score";
		int percentage=0;

		if (score >=300 && score<=579) {
			finalscore= "Bad Credit";
			percentage = 20;
		
		}else if (score >=580 && score<=669) {
			finalscore= "Ok Credit";
			percentage = 18;
			
		}else if (score >=670 && score<=739) {
			finalscore= "Good Credit";
			percentage = 21;
			
		}else if (score >=740 && score<=799) {
			finalscore= "Amazing Credit";
			percentage = 25;
			
		}else if (score >=800 && score<=850) {
			finalscore= "Excellent Credit";
			percentage = 20;
			
		}else if (score >850 || score<300) {
			System.out.println("Not a valid score");
			
		}
		if (score>300) { //important to have valid message making sense
			System.out.println("You have "+finalscore);

		}
		
		if (score>300) {
			System.out.println("You are in "+percentage+" percent");

		}
		
		keyb.close();

	}
}
