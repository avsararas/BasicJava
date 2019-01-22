package day55_Polymorphism;

public class Xmas extends Holiday   {
	
	int giftCount;
	
	public void sendMessage(){
		
		super.sendMessage(); // only way to call super class method
		
		System.out.println("Heppe Krismis");
	}
	
	public void exchangeGifts(){
		
		System.out.println("Let's spend money");

	}
	

}
