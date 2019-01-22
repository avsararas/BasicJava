package day46_this_isA;

public class Messaging {
	public static void main(String[] args) {
		
		Message m1 = new Message("Hello", "Abraham","Hubeyit"); // refers constructor 1, passing 3 strings
		Message m2 = new Message("How are you?"); // refers constructor 2 passing 1 string
		Message m3 = new Message("This keyword test", "Kamil"); // refers constructor 3
		Message m4 = new Message("This keyword test", "Kamil"); // refers constructor 4

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4);
	}

}
