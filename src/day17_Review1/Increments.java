package day17_Review1;

public class Increments {
	public static void main(String[] args) {
		
		int n1 =10;
		int n2 =10;
		
		
		n1++;
		System.out.println(n1);
		
		++n2;
		System.out.println(n2);
		
		n2=n2++; //++ will increase number next time
		System.out.println(n2);
		
		n2=++n2;
		System.out.println(n2);

	}

}
