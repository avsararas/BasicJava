package day43_StaticAndConsctuctors;

public class Application {
	public static void main(String[] args) {
		
		AppUser user1 = new AppUser("queloulaun", "Keles Oglan", "qo123");
		AppUser user2 = new AppUser("Shabalakh", "Shabal Akh", "sb123");
		AppUser user3 = new AppUser("Aormoudh", "Ahlad Armod", "aa123");
		
			System.out.println(user1.getCount()); // shows 3
		
		AppUser user4 = new AppUser(); // added 4th user
		
			System.out.println(user1.getCount()); // shows 4
		
		user1.setCount(100); // change count to 100
		
			System.out.println(user1.getCount()); // shows 4
			
			

	}
}
