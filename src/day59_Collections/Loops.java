package day59_Collections;

import java.util.ArrayList;
import java.util.List;

public class Loops {

	public static void main(String[] args) {
		
		// List<int> liste = new ArrayList<>(); // cannot take primitve type like int
		
		List<Integer> liste = new ArrayList<>();
		
		liste.add(11);
		liste.add(21);
		liste.add(44);
		
		// enhanced for loop: for each loop cannot modify the values
		for (Integer each : liste) {
			// each=10; // all will be 10 but the list value will not change
			System.out.println(each+" ");
		}
		
		// for loop can modify the values
		for (int i = 0; i < liste.size(); i++) {
			
			liste.set(i, 10); // values will be changed
			System.out.println(liste.get(i));
		}
		
		for (Integer each : liste) {
			
			// liste.remove(each); // you cannot remove element
		}
	}
}
