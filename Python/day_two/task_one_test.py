from unittest import TestCase
import task_one

class TestFunctionThatCalculateFatherAgeToSonAge(TestCase) :
	def test_that_function_only_accept_int(makaveli) :
		makaveli.assertRaises(ValueError, task_one.check_father_age_to_son, ("maka",44.99), ("kaa",98.00))

	def test_the_function_functionality(makaveli) :
		result = task_one.check_father_age_to_son(50,16)
		makaveli.assertEqual(result, 18)
		
	def test_to_verify_the_function_functionality(makaveli) :
		result = task_one.check_father_age_to_son(40,25)
		makaveli.assertEqual(result, 0)
	
	def test_for_negetive_input(makaveli) :
		makaveli.assertRaises(ValueError, task_one.check_father_age_to_son, (-1,), (-1))

	def test_for_zero_entry(makaveli) :
		makaveli.assertRaises(ValueError, task_one.check_father_age_to_son, (0), (0))
