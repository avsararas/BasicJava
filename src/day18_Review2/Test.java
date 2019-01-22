package day18_Review2;

public class Test {
	public static void main(String[] args) {

		int write = 1;
		String text = "*************";

		while (write <= text.length()) {
			System.out.println(write <= text.length() ? text.substring(0, write) : write == text.length() ? "\n" : "");
			write++;
		}

		while (write > 1) {
			System.out.println(write >= 1 ? text.substring(0, write - 2) : write == 1 ? "\n" : "");
			write--;
		}
	}
}
