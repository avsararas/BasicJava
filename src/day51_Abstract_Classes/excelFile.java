package day51_Abstract_Classes;

public class excelFile extends File{
	
	public void open() { // concrete method is defined here instead
						 // provides implementation of abstract open class
		
		System.out.println("Open the excel file");
		
	}

}
