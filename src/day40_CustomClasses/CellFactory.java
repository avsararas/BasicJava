package day40_CustomClasses;

public class CellFactory {
	public static void main(String[] args) {
		
		// CellPhone comes from the custom object named the same
		
		CellPhone phone1 = new CellPhone(); // is an instance/object of CellPhone class
		
		// properties/attributes pulled from the class, variables assigned
		phone1.brand= "Ericsson";
		phone1.color= "green";
		phone1.price= 19.99;
		
		CellPhone phone2 = new CellPhone();
		
		phone2.brand= "Alcatel";
		phone2.color= "brown";
		phone2.price= 45;
		
		// behaviors inherited from the class
		
		phone1.call();
		phone1.text();
		
		phone2.call();
		phone2.text();
		
		System.out.println("My Phone is "+phone1.brand); // prints phone1's brand property
		
		// calculate price
		
		System.out.println(phone1.price+phone2.price);

	}
}
