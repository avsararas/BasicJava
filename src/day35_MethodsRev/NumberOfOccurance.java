package day35_MethodsRev;

public class NumberOfOccurance {

	public static void main(String[] args) {

		System.out.println(noOc1("zuhahah haha ehehehe", "h"));
		
		System.out.println(noOc2("zuzu", "zu"));
	}
	
	// Version 1
	
	public static int noOc1(String str1, String str2) {

		int count = 0;

		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) == str2.charAt(0)) {
				count++;
			}
		}
		return count;
	}
	
	// Version 2
	
	public static int noOc2(String str1, String str2) {

		String piece[] = str1.split(str2);

		int count = 0;

		for (String times : piece) {

			// System.out.print(piece[count] + " ");
			
			count++;			
		}
		return count;
	}
}
