def user_like_page(my_list) :
	if not isinstance(my_list, list) :
		raise TypeError("Only list is allowed")

	for row in my_list :
		if isinstance(row, int) :
			raise ValueError("No string allowed")
		elif isinstance(row, float) :
			raise ValueError("No float as well")

	list_length = len(my_list) 

	if list_length == 0 :
		return "no one like this"
	elif list_length == 1 :
		return f"{my_list[0]}", 'like this'
	elif list_length == 2 :
		return f"{my_list[0]}, {my_list[1]}" " " 'like this'
	elif list_length == 3 :
		return f"{my_list[0]}, {my_list[1]} and {my_list[2]} " " " 'like this'
	elif list_length > 3 :
		return f"{my_list[0]}, {my_list[1]} and {len(my_list) - 2}" " " 'like this' 


names = ["peter", "james", "peter", "ikiid", "sjdhdudu", "dhdhd"]
print(user_like_page(names))