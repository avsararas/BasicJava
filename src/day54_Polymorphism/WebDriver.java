package day54_Polymorphism;

public interface WebDriver {
	
	// interface can only have public satic final vars
	
	void navigate(String address);
	void open();
	void close();

	default void quit() {
		
		System.out.println("Any Browser is quitting");
	}
	

}
