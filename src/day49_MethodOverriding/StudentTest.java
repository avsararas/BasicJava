package day49_MethodOverriding;

// Method should be inherited super class
// Overriding when two or more inherited methods everything the same, name, params and return type.
// Overriding will take from the last super class
// return type will be covariant (sub class) type
// access modifier must be the same or weaker (more visible)
// However Overloading is the same name with different params, Java treads them independently


public class StudentTest {
	
	public static void main(String[] args) {
		
		Student Recai = new Student();
		OnlineStudent KamilOnline = new OnlineStudent();
		CampusStudent Satlimis = new CampusStudent();	
		
		Recai.attend();
		KamilOnline.attend();
		Satlimis.attend();
	}
}
