package day49_Inheritance3;

public class StorePetSmart extends Store {

	public StorePetSmart() {
		super("Pet Store set"); // type referring to parent class' constructor
		System.out.println("StorePetSmart no args constructor");
	}

	public StorePetSmart(double rent) {
		super("Pet Store set", rent);
		System.out.println("StorePetSmart constructor");
		
	}
}
