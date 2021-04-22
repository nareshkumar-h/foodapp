package in.foodapp;

public class App {


	// I am the food app owner(CEO)
	public static void main(String[] args) {

		
		String [] menus = MenuManager.getAllMenus(); //Call Person1
		MenuManager.displayMenus(menus); // Call person2 and give them menus 
		

	}
}
