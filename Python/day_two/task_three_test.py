from unittest import TestCase
import task_three

class TestUserLikePageFunction(TestCase) :
	def test_that_the_function_only_accept_list(makaveli) :
		makaveli.assertTrue(task_three.user_like_page(["John", "Mark"]))

	def test_the_test_dont_accept_no_integers(makaveli) :
		makaveli.assertRaises(ValueError, task_three.user_like_page, ([34, 89]))

	def test_that_the_function_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, task_three.user_like_page, ([34.66, 89.4]))