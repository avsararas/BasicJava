package day18_Review2;

public class Loops_1 {
	public static void main(String[] args) {

		int num = 0;

		while (num < 15) { // as long as boolean value is true

			num++; // short way of saying num+1

			// num = num+1; // adds 1 to number each time and stops when reached

			// num = ++num; // adds 1 number incrementally

			// num = num++; // will not stop because num value is read first

			System.out.println(num);
		}
	}
}
