package day48_Inharitance2_Super;

public class RecycleBin extends Bin {
	
	//public RecycleBin() { // constructor
		
	//	setType("Waste Bin"); // goes to Bin class using a setter to assign value 
	//}
	
	public RecycleBin() {
		super("Choep Qetousoo, by super"); // super calls patent class', Bin's public constructor
	// super() - empty would go to the Bin() constructor
	
	}

}
