package day08_Conditionals2;

public class Grading {
	public static void main(String[] args) {
		
		char grade = 'z';
		
		if(grade =='A') {
			System.out.println("It is Excellent");
		}else if(grade =='B'){
			System.out.println("It is Fine");
		}else if(grade =='c'){
			System.out.println("It is Not Bad");
		}else if(grade =='D'){
			System.out.println("It is Bad");
		}else if(grade =='E'){
			System.out.println("It is Awful");
			System.out.println("It is Horrible");
		}else {
			System.out.println("Invalid Grade Entered");

		}
	}
}
