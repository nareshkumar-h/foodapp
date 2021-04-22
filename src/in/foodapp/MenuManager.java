package in.foodapp;

public class MenuManager {


	// person1 - Your responsibility is to give me all menus
	public static String[] getAllMenus() {
		String[] menus = { "IDLY(Rs.10 per qty)", "DOSAI(Rs.30 per qty)", 
				"PONGAL(Rs.30 qty)" };
		return menus;
	}
	
	//person2  - Display the menus which I have given
	public static void displayMenus(String [] menus) {
		System.out.println("Available Menus");
		System.out.println("--------------");
		for (String menu : menus) {
			System.out.println(menu);
		}
	}
}
