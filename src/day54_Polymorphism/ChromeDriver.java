package day54_Polymorphism;

public class ChromeDriver implements WebDriver{
	
	public void setChromeOpt(String[] str) {
		
		for (String option : str) {
			System.out.println("Setting Chrome Option: "+option);
		}
	}
	
	public void navigate(String address) {
		
		System.out.println("Chrome is now browsing: "+address);	
	}

	
	public void close() {
		System.out.println("Closing Chrome");
	}

	
	public void quit() {
		System.out.println("Quitting Chrome");

	}
	
	public void open() {
		System.out.println("Opening Chrome");

	}
}
