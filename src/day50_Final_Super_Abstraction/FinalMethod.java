package day50_Final_Super_Abstraction;

//

public class FinalMethod {

	public final void call(String phoneNo) { // final method
		System.out.println("Call" + phoneNo);
	}
	public static final void readSMS(String sender) { // final static method
		
		System.out.println("Open Messages"+sender);
	}
	
	public void calculate(final int num) { // final num value will be set
		
		
	}

}

class Sub extends FinalMethod {

	// public void call(String Zord) { // cannot override to change the behavior
	{

	}

	public void call(int number) { // can overload; this is counted as a new method

	}

}