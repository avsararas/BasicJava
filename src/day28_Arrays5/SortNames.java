package day28_Arrays5;

import java.util.Arrays;

public class SortNames {

	public static void main(String[] args) {
		
	String names[] = {"Arnold, Eprehem, Hubeyit, Sumeyye, Fadumoah"};

	for (String name : names) {
		
		Arrays.sort(names);
		
		System.out.println(name);
	}
	
	// String chars
	
	char characters[] = {'s','X','F','i','k','u','h','y','r','j','q','a'};
	
	for (char c : characters) {
		
		Arrays.sort(characters);
		
		System.out.print(c+" ");	
	}
	
	}
}
