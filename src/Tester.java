
public class Tester {
	public static void main(String[] args) {

		String[] monthWords = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] numbersLessThanTen = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		String[] numbersBetweenTenAndTwenty = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen" };
		String[] multiplesOfTen = { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
				"Ninety" };
		String[] yearWords = { "Hundred", "Thousand" };

		int year = 1977;

		int ye = year / 100; // take first and second digits

		int a = (year - ye * 100) / 10; // take third digit

		int r = (year - ye * 100) % 10; // take fourth digit

		int ar = year - (ye * 100); // take fourth and third digits

		String read = "";

		if (!(year < 1900 || year > 2100)) {
			if (year==2000) {
				read="Two Thousand";
			}else if (year < 2000) {
				read = numbersLessThanTen[0] + " "+ yearWords[1]+ " "+numbersLessThanTen[8]+" "+yearWords[0]+" ";

			}else {
				read = numbersLessThanTen[1] + " " + yearWords[1] + " ";
			}

			if (ar == 30) {
				read += multiplesOfTen[2];
			} else if (ar > 90) {
				read += multiplesOfTen[a - 1] + " " + numbersLessThanTen[r - 1];
			} else if (ar == 90) {
				read += multiplesOfTen[a - 1];
			} else if (ar > 80) {
				read += multiplesOfTen[a - 1] + " " + numbersLessThanTen[r - 1];
			} else if (ar == 80) {
				read += multiplesOfTen[a - 1];
			} else if (ar > 70) {
				read += multiplesOfTen[a - 1] + " " + numbersLessThanTen[r - 1];
			} else if (ar == 70) {
				read += multiplesOfTen[a - 1];
			} else if (ar > 60) {
				read += multiplesOfTen[a - 1] + " " + numbersLessThanTen[r - 1];
			} else if (ar == 60) {
				read += multiplesOfTen[a - 1];
			} else if (ar > 50) {
				read += multiplesOfTen[a - 1] + " " + numbersLessThanTen[r - 1];
			} else if (ar == 50) {
				read += multiplesOfTen[a - 1];
			} else if (ar > 40) {
				read += multiplesOfTen[a - 1] + " " + numbersLessThanTen[r - 1];
			} else if (ar == 40) {
				read += multiplesOfTen[a - 1];
			} else if (ar > 30) {
				read += multiplesOfTen[a - 1] + " " + numbersLessThanTen[r - 1];
			} else if (ar == 30) {
				read += multiplesOfTen[a - 1];
			} else if (ar > 20) {
				read += multiplesOfTen[a - 1] + " " + numbersLessThanTen[r - 1];
			} else if (ar == 20) {
				read += multiplesOfTen[a - 1];
			} else if (ar >10 ) {
				read += numbersBetweenTenAndTwenty[ar-11];
			} else if (ar <=10 && a>0 || r>0 ) {
				read += numbersLessThanTen[ar -1];
			}

		} else {
			read = "Year must be between 1900 and 2100";
		}

		System.out.println(read);

	}
}
