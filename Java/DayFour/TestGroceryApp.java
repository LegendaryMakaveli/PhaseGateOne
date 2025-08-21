import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;


class TestGroceryAppAddList {
	@Test
		public void  addItemToList(){
			GroceryAppMenuPage newGrocery = new GroceryAppMenuPage();
			assertEquals(newGrocery.addItemToList("Tea"), "Item Added Successfully");
		}

}


class TestGroceryAppRemoveFromList {
	@Test
		public void  removeItemFromList(){
			GroceryAppMenuPage newGrocery = new GroceryAppMenuPage();
			assertEquals(newGrocery.removeItemFromList("Tea"), "Item Removed Successfully");
		}

}

class TestGroceryAppViewTheList {
	@Test
		public void  viewItemInTheFromList(){
			GroceryAppMenuPage newGrocery = new GroceryAppMenuPage();
		}

}


