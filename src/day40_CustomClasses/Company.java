package day40_CustomClasses;

public class Company {
	public static void main(String[] args) {
		
		// multiple objects can be created here

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.work(); // returns null due no no declaration of vars yet
		
		e1.name = "Zubeyir";
		e1.lastname = "Satilmis";
		e1.email = "zs@cemaat.cor".toLowerCase();
		e1.jobTitle = "btm";
		e1.salary = 11.11;
		
		e2.name = "Hubeyit";
		e2.lastname = "Aydin";
		e2.email = "ha@cemaat.cor".toLowerCase();
		e2.jobTitle = "kmm";
		e2.salary = 1.11;
		
		System.out.println(e1.email);
		System.out.println(e1.name);
		
		e1.work(); // runs from the method in Employee class
	}
}
