package day09_Conditionals3;

public class RangeTests {
	public static void main(String[] args) {
		
		int students=62;
		if (students >=5 && (students<30)) {
			System.out.println("Let's do Tutoring");

		}else if (students>=30 && students<=60) {
			System.out.println("Let's have a lecture");

		}else if (students>60) {
			int onlinestudents = students - 60;
			System.out.println(onlinestudents + " will do online class");

		}else {
			System.out.println("Not enough students");

		}
		
	}

}
