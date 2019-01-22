package day29_MultiArrays;

public class CarsMultiArray {
	public static void main(String[] args) {

		String cars[][] = {

				{ "Honda", "Lexus", "Acura", "Mazda", "Nissan", "Subaru" },
				{ "Audi", "BMW", "Porsche", "Volswagen", "Mercedes" },
				{ "Dodge", "Ford", "Tesla", "Chevrolet", "Lincoln" },
				{ "Ferrari", "Fiat", "Maserati", "Lamborghini", "Alfa Romeo", "Lancia", } };

		// For Loop

		for (int i = 0; i < cars.length; i++) {

				switch (i) {
			
				case 0:
					System.out.print("Japanese : ");
					break;

				case 1:
					System.out.print("German : ");
					break;

				case 2:
					System.out.print("American : ");
					break;

				case 3:
					System.out.print("Italian : ");
					break;
				}
				
				for(int j =0; j < cars[i].length; j++) {
					
					System.out.print(cars[i][j] +" ");			}

			System.out.println(); // this will separate the lines in groups
		}

		System.out.println("--------------------------------------------------");

		// For Each Loop

		for (String[] carGroup : cars) {
			for (String car : carGroup) {
				System.out.print(car + " ");

			}
			System.out.println(); // this will separate the lines in groups
		}
	}
}
