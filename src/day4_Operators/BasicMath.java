package day4_Operators;

public class BasicMath {
	public static void main(String[] args) {
		
		int n1 = 100;
		int n2 = 200;
		
		System.out.println(n1+n2);
		System.out.println(n1+n2+1000);
		
		int sum = n1+n2+10;
		System.out.println(sum+" people");
		
		//3 variables apples, carrots, tomatoes with total price added % tax
		
		double apples=2.3, carrots=1.8, tomatoes=4.8;
		double tax=1.8;
		
		double total = apples + carrots + tomatoes;
		
		System.out.println(total);
		
		double taxamount=total * tax;
		
		System.out.println(taxamount);
		
		System.out.println("You need to pay: " + (taxamount+total));

	}

}
