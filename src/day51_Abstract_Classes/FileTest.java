package day51_Abstract_Classes;

public class FileTest {

	public static void main(String[] args) {

		// File f1 = new File(); will not create from abstract File class

		excelFile f1 = new excelFile(); // object from a subclass

		f1.open();
		f1.close();

		f1.setName("Test excel name");

		System.out.println(f1.getName());

		jpegFile j1 = new jpegFile(); // object from a subclass

		j1.setName("Test image file");
		j1.open();
		j1.close();

		System.out.println(j1.getName()+" "+j1.count); // shows constructor run times
		
		pdfFile p1 = new pdfFile("New PDF File");
		
		System.out.println(p1.getName()+" "+File.count); // shows constructor run times

	}
}
