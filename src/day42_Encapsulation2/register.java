package day42_Encapsulation2;

public class register {
	
	public static void main(String[] args) {
	
	loginInfo acc1 = new loginInfo(); // object
	
	acc1.setEmail("lukunku@zimbabwe.com"); // set encapsulated data
	acc1.setFirstName("Lukunku");
	acc1.setPassword("leblebi");
	
	loginInfo acc2 = new loginInfo(); // object
	
	acc2.setEmail("imporohe@chad.com");
	acc2.setFirstName("Imporohe");
	acc2.setPassword("pitsunturi");
	
	System.out.println("First name of account 1 is "+acc1.getFirstName());
	
	// new account using setAccountInfo method
	loginInfo acc3 = new loginInfo();
	
	acc3.setAccountInfo("kelek@kavun.kek", "Kamil", "maklube11");
	
	acc3.setEmail(acc3.getEmail().replace("kavun.kek", "hiyar.kop")); // update email
	
	System.out.println(acc3.getFirstName()+" "+acc3.getEmail()+" "+acc3.getPassword());
	
	System.out.println(acc1.getAccountInfo());
	
	loginInfo acc4 = new loginInfo();
	
	// new account object
	
	acc4.setAccountInfo("zubo@he.kop", "Zubeyir", "taharret");
	
	String accInfo = acc4.getAccountInfo();
	
	System.out.println(accInfo);
	}
}
