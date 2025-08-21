import grocery_app_menu_page

WELCOME TO YOUR GROCERY APP

	1 -> Add item
	2 -> Remove item
	3 -> Show available items
	0 -> Exist
""")
menu = int(input("Press any number for options   "))
match menu :
	case 1: grocery_app_menu_page.add_item_to_list(menu)

