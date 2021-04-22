package in.foodapp;

public class Registration {


	
	public static void main(String[] args) {

		String name = "naresh";
		String email = "nareshkumarh@live.com";
		Long mobileNo = 9994194773L;
		String address = "Chennai- 600062";
		String password = "pass123";
		UserManager.registerUser(name, email, mobileNo, address, password);
				
	}

}
