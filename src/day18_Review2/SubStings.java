package day18_Review2;

public class SubStings {
	public static void main(String[] args) {
		
		// getting the number part with substring method
		
		String diceResults = new String( "1-30 of 1,367 positions");
		
		System.out.println(diceResults.substring(7, 13));
		
		String langs = "Java, Kotlin, Basic, Phyton, Fortran, Cobol";
		
		String l1= langs.substring(0, 4);
		String l2= langs.substring(6, 12);
		String l3= langs.substring(14, 19);
		String l4= langs.substring(21, 27);
		String l5= langs.substring(29, 36);
		String l6= langs.substring(38, 43);
		
		System.out.println("Important Languages are: \n"+l1+"\n"+l2+"\n"+l3+"\n"+l4+"\n"+l5+"\n"+l6);
	}
}
