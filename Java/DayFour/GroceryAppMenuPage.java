import java.util.Scanner;
import java.util.ArrayList;

public class GroceryAppMenuPage {
public static ArrayList<String> items = new ArrayList<>();
public static void main(String... makaveli) {
Scanner input = new Scanner(System.in);
boolean mainMenu = true;
while (mainMenu) {
	String showMenu = """
					WELCOME TO YOUR GROCERIES APP
		
					1 -> Add item
					2 -> Remove item
					3 -> Show available item
					0 -> Exist
					""";
	System.out.println(showMenu);
	System.out.println("Enter 1, 2, or 3 to perform operation and 0 to quit");
	int number = input.nextInt();
	switch(number) {

			case 1:	System.out.println("Enter an element to add to items");
					String userItem = input.next();
					 GroceryAppMenuPage.addItemToList(userItem); break;
			
			case 2:	System.out.println("Enter an element to remove from the items");
					String removeItem = input.next();
					 GroceryAppMenuPage.removeItemFromList(removeItem); break;

			case 3:	GroceryAppMenuPage.viewItemInTheFromList(); break;
			default : System.out.println("That's not a correct input"); break;
			case 0: mainMenu = false; {
				System.out.println("Thanks for shoping with us");break;
			}
		}
	}
}

public static String addItemToList(String userAddToList) {				 						items.add(userAddToList);
return "Item Added Successfully";
}

public static String removeItemFromList(String userRemoveFromList) {						      items.remove(userRemoveFromList);
return "Item Removed Successfully";
}

public static void viewItemInTheFromList() {
System.out.println("..................Grocery_lists.............");
for(int count = 0; count < items.size(); count++) {
	if(items.isEmpty()) {
		System.out.println("Market nur dey shop");
} else {
	System.out.println(items.get(count));
}
}
}







}








