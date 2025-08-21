empty_list = []

def add_item_to_list(items) :
	if isinstance(items, float) :
		raise ValueError("No be bank app now")
	elif isinstance(items, int) :
		raise ValueError("no number")
	items = input("Add an item to the list:  ")
	empty_list.append(items)
	return "Item Added Successfully"

	
def remove_items(item_list) :
	if isinstance(item_list, float) :
		raise ValueError("no float allow")	
	
	item_list = input("Remove an item from the list:  ") 
	empty_list.remove(item_list)
	return "Item Removed Successfully"
	
def show_item_in_list() :
	return empty_list



while True:
	print("""
		WELCOME TO YOUR GROCERY APP

		1 -> Add item
		2 -> Remove item
		3 -> Show available items
		0 -> Exit
	""")
	choice = input("Enter your choice: ")

	if choice == "1":
		print(add_item_to_list(choice))
	elif choice == "2":
		print(remove_items(choice))
	elif choice == "3":
		print("Items in your list:", show_item_in_list())
	elif choice == "0":
		print("Goodbye!")
		break
	else:
		print("Invalid choice. Try again.")

