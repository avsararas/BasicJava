package day54_Polymorphism;

public abstract class SlackUser {
	
	String name;
	int age;
	
	public SlackUser() {
		this.age=age;
		this.name=name;
	}

	public abstract void sendMessage(String message);

}
