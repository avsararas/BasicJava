package day24_2_Arrays;

public class PrintArray {
	public static void main(String[] args) {
		
		String car[] = {"Audi", "Porsche", "BMW", "Toyota", "Honda", "Tesla", "Dodge", "Kia","Acura","Fiat"};
		
		for (int i = 0; i < car.length; i++) { // list all the cars in the array
			
			System.out.println(car[i]);
		}
			
		// First time of for/each loop, it only works with data collections/structures
			
		
		for (String araba : car) { // define a new variable araba, and list car array
			
			System.out.println("*"+araba+"*");
			}
		
		int num[]= {5,7,67,5432,3556,67}; // defined a new int containing all num
		
		for (int j : num) {
			
			System.out.print(j+" ");
		}
			
	}
}
