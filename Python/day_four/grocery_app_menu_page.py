empty_list = []

def add_item_to_list(items) :
	if not isinstance(items, list) :
		raise TypeError("Its an app for christ sake")

	for row in items :
		if isinstance(row, int) :
			raise ValueError("No number allow")
		elif isinstance(row, float) :
			raise ValueError("No be bank app now")
	
		items = input("Add an item to the list:  ")
		empty_list.append(items)
		return "Item Added Successfully"

	
def remove_items(item) :
		pass