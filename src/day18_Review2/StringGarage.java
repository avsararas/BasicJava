package day18_Review2;

public class StringGarage {
	public static void main(String[] args) {

		String garage = new String("Toyota, Nissan, Honda, BMW, Maserati, Ford").toLowerCase();

		String say1, say2, say3, say4;

		if (garage.isEmpty()) {

			System.out.println("There is no cars in garage.");
		}

		if (garage.contains("toyota") || garage.contains("nissan")) {
			say1 = "There is a Japanese car in garage.";
		} else {
			say1 = "There is no Japanese car in garage";
		}

		if (garage.indexOf("bmw") > -1) { // Very Important part as an alternative method
			say2 = "There is a German car in garage.";
		} else {
			say2 = "There is no German car in garage.";
		}

		if (garage.contains("maserati")) {
			say3 = "There is an Italian car in garage.";
		} else {
			say3 = "There is no Italian car in garage.";
		}

		if (garage.contains("ford")) {
			say4 = "There is an American car in garage.";
		} else {
			say4 = "There is no American car in garage.";
		}

		System.out.println(say1 + "\n" + say2 + "\n" + say3 + "\n" + say4);

	}
}
