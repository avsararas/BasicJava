package day49_Inheritance3;

public class StoreTest {
	public static void main(String[] args) {
		// 3 ways to create an object due to 3 defined constructors
		
		Store store1 = new Store ("Grocery"); // refers to type constructor
		Store store2 = new Store (1000.00); // refers to rent constructor
		Store store3 = new Store ("FedEx", 5000.00); // refers to both constructors
	
	System.out.println("------Petsmart Object 1 created------");
	
	StorePetSmart petSmart1 = new StorePetSmart();
	
	System.out.println("------Petsmart Object 2 created------");

	
	StorePetSmart petSmart2 = new StorePetSmart(567.22); // passing rent to constructor
	
	System.out.println("PetSmart 1 type "+ petSmart1.getType());
	
	System.out.println("PetSmart 2 type "+ petSmart2.getType());


	}
}
