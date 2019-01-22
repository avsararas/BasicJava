package day54_Polymorphism;

public class UserRun {

	public static void main(String[] args) {
		
		RegularUser u1 = new RegularUser("Satilmis", 33, 1234);
		u1.joinAGroup();
	
		AdminUser a1 = new AdminUser("Zubeyir", 12, true);
		a1.sendMessage("Hot Zot");
		a1.activateUser();
		
	}
}
