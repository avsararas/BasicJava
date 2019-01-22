package day58_Exceptions;

public class CheckingAcc extends BankAcc {

	private int balance;

	public CheckingAcc(long cardNum, String cardName, int balance) {
		super(cardNum, cardName);
		this.balance = balance;

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {

		return getCardName() + " CheckingAccount [balance=" + balance + " | card number is " + getCardNum() + "  ]";
	}

	@Override

	public void deposit(int dep) {

		this.balance += dep;
	}

	@Override
	public void withdraw(int wit) throws RuntimeException {

		this.balance -= wit;

		if (this.balance < 0) {
			throw new RuntimeException("YOUR BALANCE DROPPED TO BELOW 0");
		}
	}

}
