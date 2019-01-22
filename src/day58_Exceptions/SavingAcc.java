package day58_Exceptions;

public class SavingAcc extends BankAcc {

	private int balance;
	private double penaltyPercentage;

	@Override
	public String toString() {
		return getCardName() + " SavingAcc [balance=" + balance + ", penaltyPercentage=" + penaltyPercentage + " | "
				+ getCardNum() + "  ]";
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getPenaltyPercentage() {
		return penaltyPercentage;
	}

	public void setPenaltyPercentage(double penaltyPercentage) {
		this.penaltyPercentage = penaltyPercentage;
	}

	public SavingAcc(long cardNum, String cardName, int balance) {
	       super(cardNum, cardName);
	       this.balance = balance ;

	       if(balance < 0) {
	               throw new RuntimeException("CAN NOT CREATE SAVING ACCOUNT WITH MINUS BALANCE");
	       }

	   }

	@Override
	public void deposit(int num1) {

		this.balance = (int) (num1 * 1.1) + this.balance;

	}

	@Override
	public void withdraw(int num2) throws RuntimeException {

		this.balance = (int) (this.balance - 1.1 * (num2));

	}

}