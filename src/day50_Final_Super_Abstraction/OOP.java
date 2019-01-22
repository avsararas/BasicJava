package day50_Final_Super_Abstraction;

public class OOP extends Language{
	
	public String name ="Delphi"; // parent variable is hidden here
	
	public void printOOPName() {
		
		System.out.println("Language is: "+name);
		
		System.out.println(super.name+"super");

	}

	
}
