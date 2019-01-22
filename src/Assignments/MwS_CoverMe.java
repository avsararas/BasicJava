package Assignments;

public class MwS_CoverMe {

	public static void main(String[] args) {
		System.out.println(coverString("java methods", "me")); // java [me]thods
	}

	public static String coverString(String main, String coverME) {

		if (main.contains(coverME)) {

			return main.replace(coverME, "[" + coverME + "]");

		} else {

			return "[" + main + "]";
		}
	}

}