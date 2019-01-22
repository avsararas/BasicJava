package day14_MondayTurmoil;

import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {

	Scanner keyb= new Scanner(System.in);
		
	System.out.println("Enter Price in Cents: ");
			
	int price=100-keyb.nextInt();
	
	int pennies=price; // This part solves the if section below properly
	
	int quarter=pennies/25;
	pennies%=25;
	
	int dime=pennies/10;
	pennies%=10;
	
	int nickel=pennies/5;
	pennies%=5;
	
		if (price<25 || price>75) {
		System.out.println("Please Enter Price between 25 to 100");
	
		}else if (pennies%5!=0){
		System.out.println("Please Enter Price folds of 5 ");
	
		}else{
		System.out.println("You will get back "+quarter+" Quarters "+dime+" Dimes "+nickel+" Nickels");

		}
	keyb.close();
	}
}