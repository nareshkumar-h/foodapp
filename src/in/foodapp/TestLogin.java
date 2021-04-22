package in.foodapp;

public class TestLogin {

	// Valid email and password
	public static void testWithValidEmailAndPassword() {
		String email = "nareshkumarh@live.com";
		String password = "pass1234";
		boolean valid = UserManager.login(email, password);
		if (valid) {
			System.out.println("Successfully LoggedIn");
		} else {
			System.out.println("Invalid Login Credentials");
		}
	}

	// Valid email and invalid password
	public static void testWithValidEmailAndInvalidPassword() {
		String email = "nareshkumarh@live.com";
		String password = "pas";
		boolean valid = UserManager.login(email, password);
		if (valid) {
			System.out.println("Successfully LoggedIn");
		} else {
			System.out.println("Invalid Login Credentials");
		}
	}

	// InValid email and valid password
	public static void testWithInvalidEmailAndValidPassword() {
		String email = "n@live.com";
		String password = "pass1234";
		boolean valid = UserManager.login(email, password);
		if (valid) {
			System.out.println("Successfully LoggedIn");
		} else {
			System.out.println("Invalid Login Credentials");
		}
	}

	public static void main(String[] args) {
		testWithValidEmailAndPassword();
		testWithValidEmailAndInvalidPassword();
		testWithInvalidEmailAndValidPassword();
	}
}
