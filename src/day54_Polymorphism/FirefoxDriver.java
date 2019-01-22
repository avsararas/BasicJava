package day54_Polymorphism;

public class FirefoxDriver implements WebDriver{

	
	public void setFireOpt(String[] str) {
		for (String option : str) {
			System.out.println("Setting Frifox Option: "+option);
		}
			
	}
	
	public void open() {
		System.out.println("Opening Firefox");

	}
	
	public void close() {
		System.out.println("Closing Firefox");

	}

	public void quit() {
		System.out.println("Quitting Firefox");

	}
	
	public void navigate(String address) {
		System.out.println("Firefox is now browsing: "+address);

	}
}
