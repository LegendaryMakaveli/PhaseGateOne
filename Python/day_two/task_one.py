def check_father_age_to_son (father_age, son_age) :
	if not isinstance(father_age, int) :
		raise ValueError("It can only be integer")
	elif not isinstance(son_age, int) :
		raise ValueError("It can only be integer")
	if father_age == 0 :
		raise ValueError("No Zero")
	elif son_age == 0 :
		raise ValueError("No zero")

	father_predict_age = father_age - son_age * 2
	
	if (father_predict_age < 0) :
		return 0

	return father_predict_age