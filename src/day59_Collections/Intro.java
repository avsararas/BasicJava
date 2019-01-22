package day59_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Intro {
	
	public static void main(String[] args) {
		
		// Collection is the reference type decided what can be accessed
		
		Collection<String> alist=new ArrayList<String>(); 
		
		alist.add("kebab");
		alist.add("lahmacun");
		alist.add("cigkofte");
		alist.add("doner");
		alist.add("pilav");
	
		
		for (String string : alist) {
			System.out.println(string);
		}
		
		
		// LinkedList works with nodes using pointers
		alist = new LinkedList<>();
		
		alist.add("hiyar");
		alist.add("acur");
		alist.add("kabak");

		alist.forEach(System.out::println);
	}
}
