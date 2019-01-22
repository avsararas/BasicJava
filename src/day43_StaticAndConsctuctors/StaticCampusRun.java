package day43_StaticAndConsctuctors;

public class StaticCampusRun {
	public static void main(String[] args) {
		
		StaticCampus.city = "Yozgat"; // direct access without creating the object
		
		StaticCampus.aboutCampus(); // prints using aboutCampus method
		
		
		StaticCampus c = new StaticCampus();
		System.out.println(c.city);
		c.aboutCampus();
		
	}

}
