package day08_Conditionals2;

import java.util.Scanner;

public class ChooseLanguage {
	public static void main(String[] args) {
		
		Scanner keyb= new Scanner(System.in);
	
		System.out.println("Please Select Language:\n"+ // \n for new lines
				 		"English - 1\n"+
						"German - 2\n"+
						"French - 3\n"+
						"Spanish - 4\n"+
						"Chinese - 5\n");
		
		int language=keyb.nextInt();
		
		String greeting=""; // this "" needed to give an initial string value
		
		if (language==1) {
			greeting = "Hello, How are you?";
		}	
		else if(language==2) {
			greeting = "Enshuldigung?";
		}
		else if(language==3) {
			greeting = "le ploeaux le sibuple?";
		}
		else if(language==4) {
			greeting = "travaho amigo?";
		}
		else if(language==5) {
			greeting = "nn xe  xin hue?";
		}
		else {
			System.out.println("Invalid Language Selected");
		}
		
		System.out.println(greeting);
		keyb.close();
	}
}

