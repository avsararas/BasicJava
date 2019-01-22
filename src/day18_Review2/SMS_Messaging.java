package day18_Review2;

public class SMS_Messaging {
	public static void main(String[] args) {

		String SMS = new String(
		"Sender:<Hulusi Smith> From Number:[202-123-3456]. Message:{I love programming and problem solving}");

		String sender, phoneNumber, msg;

		sender = SMS.substring(SMS.indexOf("<") + 1, SMS.indexOf(">"));
		phoneNumber = SMS.substring(SMS.indexOf("[") + 1, SMS.indexOf("]"));
		msg = SMS.substring(SMS.indexOf("{") + 1, SMS.indexOf("}"));

		System.out.println(sender + "\n" + phoneNumber + "\n" + msg);

	}
}
