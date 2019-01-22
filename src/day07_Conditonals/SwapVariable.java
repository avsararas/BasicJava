package day07_Conditonals;

public class SwapVariable {
	public static void main(String[] args) {
		//Swap variable values with a 3rd variable
		
		int x=100;
		int y=200;
		
		int temp=x;
		
		x=y;
		y=temp;
		
		System.out.println(x +" "+ y);
		
		//Swap variable without a third variable
		
		int a=5;
		int b=10;
		
		a += b;
		b = a-b;
		a -= b;
		
		System.out.println(a +" "+ b);
		
	}

}
