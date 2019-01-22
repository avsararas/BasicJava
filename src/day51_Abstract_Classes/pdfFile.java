package day51_Abstract_Classes;

public class  pdfFile extends File {

	public void open() {
		System.out.println("Opened PDF file");
	}
	
	public pdfFile(String name) {
		super(name); // refers to abstract File class's one arg constructor
	}
}
