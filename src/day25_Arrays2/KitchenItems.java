package day25_Arrays2;

public class KitchenItems {
	public static void main(String[] args) {

		// Create and array called kitchenItems

		String utils[] = { "knife", "wooden spoons", " plates", "cups", "forks", "pan", "pot", "trash can", "fridge",
				"dishwasher" };
		

		for (String item : utils) {
			
			item = item.toLowerCase().trim(); // makes sure Cap Letter will be ignored with gaps
			
			System.out.println("*" + item + "*");

			switch (item) {
			case "knife":

				System.out.println("cuts food");
				break;

			case "wooden spoons":

				System.out.println("are the most important utensils in the kitchen");
				break;

			case "plates":

				System.out.println("Used to serve dish");
				break;

			case "cups":

				System.out.println("used to drink beverages");
				break;

			case "forks":

				System.out.println("Used to eat food");
				break;

			case "pan":

				System.out.println("Helps to fry food");
				break;

			case "pot":

				System.out.println("Helps to cook food");
				break;

			case "trash can":

				System.out.println("Keps garabage");
				break;

			case "fridge":

				System.out.println("Stores food");
				break;

			case "dishwasher":

				System.out.println("Washes the dishes");
				break;

			}
		}
	}
}