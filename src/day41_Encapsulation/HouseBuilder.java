package day41_Encapsulation;

public class HouseBuilder {

	public static void main(String[] args) {

// Object variables are declared outside of any method but in a class
// Local variables are defined in methods

		House h1 = new House(); // House is the new data type like int, double and String
		House h2 = new House();
		House h3 = new House();

		h1.address = "1051 Laidlaw Ave.";
		h1.bedroms = 45;
		h1.type = "factory";
		h1.year = 1945;

		h2.address = "6012 Penn Ave. S.";
		h2.bedroms = 3;
		h2.type = "Slavery";
		h2.year = 1956;

		h3.address = "1111 Honolulu Way.";
		h3.bedroms = 5;
		h3.type = "Hut";
		h3.year = 1977;

		House[] houses = new House[3]; // Number of array must be set
		houses[0] = h1;
		houses[1] = h2;
		houses[2] = h3;
		
		for (House house : houses) { // for each loop
			
			System.out.println(house.address+" "+house.type);
		}
		
		for (int i = 0; i < houses.length; i++) { // for loop
			
			System.out.println(houses[i].address+" "+houses[i].type);
		}
	}

}
