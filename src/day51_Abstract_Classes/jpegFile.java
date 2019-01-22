package day51_Abstract_Classes;

public class jpegFile extends File{
	
	@Override
	public void open() { // provides implementation of abstract open class
		
		System.out.println("Open the image file");

	}

}
