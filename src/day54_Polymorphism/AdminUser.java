package day54_Polymorphism;

public class AdminUser extends SlackUser {
	
	boolean isOwner;

	public AdminUser(String name, int age, boolean isOwner) {
		
		super.name=name;
		super.age=age;
		this.isOwner=isOwner;

	}

	public void sendMessage(String message) {
		
		System.out.println("Admin is sending a message "+message+" with @channel");
	}
	
	public void activateUser() {
		
		System.out.println("User Activated");

	}
}
