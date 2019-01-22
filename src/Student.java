
public class Student {
	
	static String name="hede";
	static int age=9;
	
	 Student(String name, int age) {
		 this.name="dede";
		 this.age=5;
	 
	 }
	 
	 Student(String name) {
		 this(age);

	 
	 }
	 
	 Student(int age) {
		 this.name="dede";
		 this.age=5;
	 
	 }
	 
	 public static void main(String[] args) {
		 
		 Student s1 = new Student("Kelek", 3);
		
		 System.out.println(name+" "+age);
		 
	}

}
