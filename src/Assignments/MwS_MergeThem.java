package Assignments;

public class MwS_MergeThem {

	public static void main(String[] args) {

		System.out.println(mergeStrings("java", "selenium"));
	}

	public static String mergeStrings(String one, String two) {

		char[] chars1 = one.toCharArray();

		char[] chars2 = two.toCharArray();

		String total = "";

		if (chars1.length > chars2.length) {
			
			for (int i = 0; i < chars2.length; i++) {

				total += chars1[i] + "" + chars2[i];
				
			}
			
			for (int i = 0; i < chars1.length-chars2.length; i++) {
				
				total+=chars1[chars2.length+i];
			}
		
		}else {
			
			for (int i = 0; i < chars1.length; i++) {

				total += chars1[i] + "" + chars2[i];
			}
			
			for (int i = 0; i < chars2.length-chars1.length; i++) {
				
				total+=chars2[chars1.length+i];
			}
		}

		return total;
	}
}
