package day58_Exceptions;

public abstract class BankAcc {
	
	private long CardNum;
	private String cardName;
	
	public BankAcc(long cardNum, String cardName) { // constructor
	super();
	this.cardName=cardName;
	this.CardNum=cardNum;
	}
	
	public long getCardNum() {
		return CardNum;
	}

	public void setCardNum(long cardNum) {
		CardNum = cardNum;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	
	
	public abstract void deposit(int dep);
	
	public abstract void withdraw (int dep) throws RuntimeException;

	
	@Override
	public String toString() { // toString method from the Object class
		
		
		return "Card Name: "+cardName+ " with Card No: "+CardNum;
	}
}
