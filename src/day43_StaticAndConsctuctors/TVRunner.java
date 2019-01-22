package day43_StaticAndConsctuctors;

public class TVRunner {
	public static void main(String[] args) {
		
		TV myTV = new TV(); // Created TV object 1, or instantiation
		TV yourTV = new TV("Telefunken"); // Created TV object 1
	
	
	System.out.println(myTV.isOn());
	
	myTV.turnOn();
	yourTV.turnOn();
	myTV.setChannel(55);
	
	System.out.println(myTV.isOn()+" "+myTV.getChannel());
	
	myTV.channelDown();
	yourTV.channelUp();
	
	System.out.println(myTV.getChannel());
	
	System.out.println(yourTV.getChannel());

	}

}
