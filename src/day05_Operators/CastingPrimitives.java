package day05_Operators;

public class CastingPrimitives {
	public static void main(String[] args) {

		//implicit casting, 
		
		int count=345;
		double d = count; // The result will be converted 345.0 automatically
		
		System.out.println(d);
		
		//explicit used for larger to smaller casting
		
		int m= 70;
		byte z=(byte)m;
		
		double price=453.9;
		int total=(int)price;
		
		System.out.println(total);

		//String to number, last to digits will be put side by side
		
		String nb="2345";
		System.out.println(nb+5+2); //234552
		
		//It will be calculated normally with ()
		System.out.println(nb+(5+2)); //23457
		
		System.out.println(5/2); //This will be 2 
		System.out.println(5/2.0); //This will be 2.5
		
		int counter = 100;
		counter = counter + 1;
		
		System.out.println(counter); //101
		
		counter=counter + 10;
		System.out.println(counter); //111
		
		counter += 10; //SHORTHAND assignment, same thing counter = counter + 10
		System.out.println(counter); 
		
		counter = 15;
		counter *=2;
		System.out.println(counter); //111
		counter /=5;
		System.out.println("After /=" + counter);

	}

}
