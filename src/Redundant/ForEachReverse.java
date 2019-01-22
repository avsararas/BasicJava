package Redundant;

public class ForEachReverse {
	public static void main(String[] args) {
		
int[] points = { 2, 4, 7, 92, 22, 44, 55, 60, 70, 99 };
		
		String s = ""; 
		for(int aa:points) {
		s= aa + " " + s;
		}
		System.out.println(s);
	}

}
