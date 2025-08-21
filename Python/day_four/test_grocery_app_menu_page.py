from unittest import TestCase
import grocery_app_menu_page



class TestTheFunctionThatAddItemToList(TestCase) :
	def test_that_the_function_only_accept_String(makaveli) :
		makaveli.assertEqual(grocery_app_menu_page.add_item_to_list(["coke"]), "Item Added Successfully")

	def test_that_the_function_dont_accept_integers(makaveli) :
		makaveli.assertRaises(ValueError, grocery_app_menu_page.add_item_to_list, ([87,99]))

	def test_that_the_function_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, grocery_app_menu_page.add_item_to_list, ([87.8,99.99,2.8]))


class TestTheFunctionThatRemoveItemFromTheList(TestCase) :
	def test_that_the_function_exist(makaveli) :
		 grocery_app_menu_page.remove_items(["coke"])

	def 