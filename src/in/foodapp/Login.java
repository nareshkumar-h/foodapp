package in.foodapp;

public class Login {

	public static void main(String[] args) {

		String email = "nareshkumarh@live.com";
		String password= "pass123";
		boolean valid = UserManager.login(email, password);
		if(valid) {
			System.out.println("Successfully LoggedIn");
		}
		else {
			System.out.println("Invalid Login Credentials");
		}
	}

}
