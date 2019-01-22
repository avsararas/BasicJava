package day31_Methods2;

public class MethodsWithConditions {
	
// Method accepts 2 nums and print the larger

	
	public static void main(String[] args) {
		
		compare(200, 300);
	
	}
	
 
	public static void compare(int n1, int n2) {
		
		if (n1>n2) {
			
			System.out.println(n1+" is larger");
			
		}else if (n1<n2) {
			System.out.println(n2+" is larger");

		}else {
			System.out.println(n1+n2+" are equal");
		}
	}

}
