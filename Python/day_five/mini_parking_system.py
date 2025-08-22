#(1) define a function that add car to park in the lot
#(1a) test for possibly edge cases like no string allowed, no float and no negative
#(1b) declare an empty list to store car that packed
#(1c) append userInput to your already declared list
#(1d) return if successful

#(2) define a function that remove car from the parking lot
#(2a) test for possibly edge cases like the add function
#(2b) remove car from parking lot
#(2c) return if successful

#(3) define a function to show available space and occupied ones
#(3a) run a loop to check if anywhere its 0 and declare available space
#(3b) in the same loop if its 1 return occupied






new_space = [0] * 20

def park_in_the_lot(my_car) :
	if type(my_car) == float :
		raise ValueError("No float allowed")
	elif type(my_car) == str :
		raise ValueError("No String allowed")
	elif (my_car) <= 0 :
		raise ValueError("No negative numbers or zero")

		my_car = input("Park your car:  ")
		new_space.append(my_car)
		return "Car parked Successfully"


def remove_car_from_lot(remove_my_car) :
	if type(remove_my_car) == float :
		raise ValueError("No float allowed")
	elif type(remove_my_car) == str :
		raise ValueError("No String Allowed")
	elif (remove_my_car) <= 0 :
		raise ValueError("No negative number or Zero")
	
	remove_my_car = input("Remove an item from the list:  ") 
	new_space.remove(remove_my_car)
	return "Item Removed Successfully"


def show_available_space() :
	for space in new_space :
		if space == 0 :
			return  "You can park here"
		elif space == 1 :
			return "No space"







