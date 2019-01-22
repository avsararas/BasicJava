package day33_Methods4;

public class pallindrome {

	public static void main(String[] args) {

		ispallindrome("level");
	}

	public static boolean ispallindrome(String str) { // get TRUE or FALSE

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reversed += str.charAt(i);
		}

		if (str.equalsIgnoreCase(reversed)) {
			return true;
		}
		
		return false;

	}
}
