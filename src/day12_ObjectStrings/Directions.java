package day12_ObjectStrings;

import java.util.Scanner;

public class Directions {
	public static void main(String[] args) {
		Scanner keyb= new Scanner(System.in);
		System.out.println("Enter Your Location Letter: ");
		
		char point=keyb.next().charAt(0);
		
		System.out.println("Enter Your Destination Letter: ");
		
		char dest=keyb.next().charAt(0);
		
		String say="";
		
		if (point==dest) {
			say="You are in the same spot";
		
		}else if((point=='A' || point=='a') && (dest=='B' || dest=='b')) {
			say="You need to make one right";
		
		}else if ((point=='A' || point=='a') && (dest=='C' || dest=='c')) {
			say="You need to make one right then down";

		}else if ((point=='A' || point=='a') && (dest=='D' || dest=='d')) {
			say="You need to make one right then down and left";

		}else if ((point=='B' || point=='b') && (dest=='C' || dest=='c')) {
			say="You need to make down";

		}else if ((point=='B' || point=='b') && (dest=='D' || dest=='d')) {
			say="You need to make down then left";

		}else if ((point=='B' || point=='b') && (dest=='A' || dest=='a')) {
			say="You need to make one right then down then up";

		}else if ((point=='C' || point=='c') && (dest=='A' || dest=='a')) {
			say="You need to make one up";

		}else if ((point=='C' || point=='c') && (dest=='B' || dest=='b')) {
			say="You need to make one up then right";

		}else if ((point=='C' || point=='c') && (dest=='D' || dest=='d')) {
			say="You need to make one up then right and down";
		
		}else if ((point=='D' || point=='d') && (dest=='A' || dest=='a')) {
			say="You need to make one up";
				
		}else if ((point=='D' || point=='d') && (dest=='B' || dest=='b')) {
			say="You need to make one up and right";
			
		}else if ((point=='D' || point=='d') && (dest=='C' || dest=='c')) {
			say="You need to make one up then down";
		
		}else {
			say="Enter a valid location letter";
		}
		
		System.out.println(say);
		keyb.close();

		}
	}