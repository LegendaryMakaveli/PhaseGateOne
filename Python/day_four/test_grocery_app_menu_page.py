from unittest import TestCase
import grocery_app_menu_page



class TestTheFunctionThatAddItemToList(TestCase) :
	def test_that_the_function_only_accept_String(makaveli) :
		makaveli.assertEqual(grocery_app_menu_page.add_item_to_list("coke"), "Item Added Successfully")

	def test_that_the_function_dont_accept_integers(makaveli) :
		makaveli.assertRaises(ValueError, grocery_app_menu_page.add_item_to_list, (89))

	def test_that_the_function_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, grocery_app_menu_page.add_item_to_list, (89.89))

	def test_the_code_functionality(makaveli) :
		grocery_app_menu_page.empty_list.clear()
		grocery_app_menu_page.empty_list.append("coke")
		makaveli.assertIn("coke",grocery_app_menu_page.empty_list)
		


class TestTheFunctionThatRemoveItemFromTheList(TestCase) :
	def test_that_function_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, grocery_app_menu_page.remove_items,(78.89))
	
	def test_that_function_dont_accept_int(makaveli) :
		makaveli.assertRaises(ValueError, grocery_app_menu_page.remove_items, (78))








