package day47_TestPack2;

import day47_TestPack1.Student;

public class Main2 {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name="Abdalla"; // visible from the 1st package, public
		// s1.age=109; not visible due to protected
		
	}

}
