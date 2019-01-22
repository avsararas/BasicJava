package day54_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class WebDriverRun {

	public static void main(String[] args) {
		
		System.out.println("Object reference swap version:\n");
		
		WebDriver driver = new ChromeDriver();
		driver.open();
		driver.navigate("zimbabve.gov");
		driver.close();
		driver.quit();
				
		driver = new FirefoxDriver(); // reference pointer changes here
		driver.open();
		driver.navigate("honduras.gov");
		driver.close();
		driver.quit();
		
		System.out.println("\nArray and Loop verison:\n");
				
WebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver(), new ChromeDriver()};
			
		for (WebDriver obj : drivers) {
			obj.open();
			obj.navigate("Tanazina.gov");
			obj.close();
			obj.quit();
		}
		
		System.out.println("\nArrayList and loop version:\n");
		
		List<WebDriver> list =  new ArrayList<>();
		list.add(new ChromeDriver());
		list.add(new FirefoxDriver());

		for (WebDriver browser : list) {
			browser.navigate("nigeria.gov");			
			browser.open();
			browser.close();
			browser.quit();
			System.out.println();
		}
	}
}
