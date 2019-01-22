package day57_Exceptions;

public class CallStack {
	
	// if no method handles the exception it will become a CallStack Exception
	public static void main(String[] args) throws InterruptedException {

		CallZubeyir();
		CallSatilmis();

	}

	public static void CallZubeyir() {
		System.out.println("Method CallZubeyir");
		CallKamil();

	}

	public static void CallKamil() {
		System.out.println("Method CallKamil");

		try {
			throw new RuntimeException("Kamil is eating maklube"); // generating exception
		} catch (Exception e) {
			System.out.println("Kamil is saved");
		}
	}

	public static void CallSatilmis(){ // throws added in the main method
		System.out.println("Method CallSatilmis");

	}
}
