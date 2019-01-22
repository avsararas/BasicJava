package day43_StaticAndConsctuctors;

public class AppUser {

	private String userId; // private static String userId; makes all userId the same
	private String name;
	private String password;
	private static int count; // shared with static
	
	public AppUser() {
		count++; // when an object created count increments
	}

	// auto generated constructor
	public AppUser(String userId, String name, String password) {
		this.userId = userId;
		this.name = name;
		this.password = password;
		count++;
	}
	// getter and setters

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		AppUser.count = count;
	}

}
