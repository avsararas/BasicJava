package day58_Exceptions;



public class MainAcc {
	
	public static void main(String[] args) {
				
		BankAcc b1 = new SavingAcc(123123123, "Zubeyir", 233);
		System.out.println(b1.toString());

		BankAcc b2 = new CheckingAcc(342342, "Hubeyit", 212);
		System.out.println(b2.toString());


	}
}
