package day42_Encapsulation2;

public class loginInfo { // custom class/template

	private String email;
	private String firstName;
	private String password;
	
	// method to enter all info at once
	public String getAccountInfo() {
		
		String all = email+" "+firstName+" "+password;
		
		return all;
		
		// return email+" "+firstName+" "+password;
		
	}
	
	public void setAccountInfo(String email, String firstName, String password) {
		
		this.email=email;
		this.firstName=firstName;
		setPassword(password);  // calling the password method within a method
		
	}

	public String getEmail() {
		return email;
		
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String newfFirstName) {
		firstName = newfFirstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		
		if (newPassword.length()<6) { // pass length check newPassword!
			System.out.println("Password must be at least 6 characters.");
			return; // cannot be return-1 because class is void
		}
		password = newPassword;
	}
	
	
}
