from unittest import TestCase
import task_two

class TestTheFunctionThatGiveResultOfStudentWithLetterGrade(TestCase) :	
	def test_the_function_exist(makaveli) :
		task_two.get_student_grade(23,44,56)

	def test_for_the_function_functionality(makaveli) :
		result = task_two.get_student_grade(23, 55,56)
		makaveli.assertEqual(result, 'F')

	def test_verify_the_function_functionality(makaveli) :
		result = task_two.get_student_grade(233,444,4456)
		makaveli.assertEqual(result, 'F')
