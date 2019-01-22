package day54_Polymorphism;

public class RegularUser extends SlackUser{
	
	int groupNumber;

	public RegularUser(String name,int age, int groupNumber) {
		
		super.name=name;
		super.age=age;
		this.groupNumber=groupNumber;
		
	}
	
	public void sendMessage(String message) {
		System.out.println("Sending a message");
		
	}
	
	public void joinAGroup() {
		System.out.println("Regular user joins a group");
		
	}
}
