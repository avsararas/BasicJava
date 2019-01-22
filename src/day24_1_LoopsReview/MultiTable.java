package day24_1_LoopsReview;

public class MultiTable {

	public static void main(String[] args) {

		for(int outer = 1; outer <= 10; outer++) {
			
			
			for(int inner = 1; inner <=10; inner++) {
				
				if (outer<=10) {
					System.out.print("| "+inner+" x "+outer+" = "+outer*inner+"  ");


					
				} else {
					System.out.println("| "+outer+" x "+inner+" = "+outer*inner+" ");

				}

			}
			
			System.out.println("|");

		}
	}
}
