package day46_this_isA;

public class Message {
	
// this() is used to call a constructor form another constructor when similar overloaded
// constructor do the same function
// this() has to be the first statement a constructor
	
	private String body;
	private String sender;
	private String receiver;
	
// toString Generated from source menu/ special method to describe the object in string format
	
	public String toString() { // toString class
		return "Message [body=" + body + ", sender=" + sender + ", receiver=" + receiver + "]";
	}

	public Message(String body, String sender, String receiver) { // generated constructor 
		this.body = body;
		this.sender = sender;
		this.receiver = receiver;
	}	
	
	public Message(String body) {// overload the constructor
		this(body, "Unknown", "Unknown"); // this calls the constructor with matching params
		System.out.println("One arg constructor");
		
	}
	
	public Message(String body, String receiver) {// overload the constructor
		// this(body,"Unknown","Unknown" );		
		this.body = body;
		this.sender = "Unknown";
		this.receiver = "Unknown";
	}
		
	public Message() { // Constructor 4
		// this("","Unknown","Unknown"); // refactor to call other matching constructor
		this.body="";
		sender ="Unknown";
		receiver="Unknown";
	}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
}
