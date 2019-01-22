package day55_Polymorphism;

public class Holiday implements dayOff{
	
	String name; // instance field, not variable defined
	
	public void sendMessage(){
		System.out.println("Holiday message: Kemkir");
	}

	@Override
	public void goToVacation() {
		System.out.println("Let's go to Yozgat");
		
	}

}
