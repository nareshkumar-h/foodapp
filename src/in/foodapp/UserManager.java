package in.foodapp;

public class UserManager {

	public static void registerUser(String name, String email, Long mobileNo, 
			String address, String password) {
		
		System.out.println("Successfully Registered in our notebook");
	}
	
	public static boolean login(String email, String password) {
		boolean valid = email.equals("nareshkumarh@live.com") && 
				password.length() >=8;
		return valid;
	}
}
