def get_student_grade(grade_one, grade_two, grade_three) :
	if not isinstance(grade_one, int) :
		raise TypeError("Only integers is allowed")
	elif not isinstance(grade_two, int) :
		raise TypeError("Only integers is allowed")
	elif not isinstance(grade_three, int) :
		raise TypeError("Only integers is allowed")

	if not grade_one :
		raise TypeError("cannot be empty")
	elif not grade_two :
		raise TypeError("cannot be empty")
	elif not grade_three :
		raise TypeError("cannot be empty")

	result = (grade_one + grade_two + grade_three) / 3

	if (result >= 90 and result <= 100) :
		return 'A'
	elif  (result >= 80 and result < 90) :
		return 'B'
	elif  (result >= 70 and result < 80) :
		return 'C'
	elif  (result >= 60 and result < 70) :
		return 'C'
	else :
		return 'F'
	


