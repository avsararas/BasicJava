package day36_MethodOverload;

public class OverloadMethods {

	// same name methods
	// return type does not matter

	public static void main(String[] args) {

		System.out.println(add(34, 544)); // calls the add method below
		
		System.out.println(add(5.6, 7.89, 4.56));

	}

	public static int add(int n1, int n2) {

		return n1 + n2;
	}

	public static double add(double d1, double d2, double d3) {

		return d1 + d2 + d3;
	}

// Method: work
// 1 params: String JobType
//   returns boolean if job SDET true, else false
//   print: working as <jobType> is nice

// 2 params: int hours
//   returns double salary  hours 60
//   print: worked <this many> hours and made <that much> income

	public static boolean work(String jobType) {

		System.out.println("working as" + jobType + " is nice");

		return jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("develeoper"); // true
	}

	public static double work(int hours) {

		double salary = hours * 60;

		return salary;
	}

}