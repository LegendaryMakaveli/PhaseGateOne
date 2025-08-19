from unittest import TestCase
import task_four


class TestThatDetermineIfGasWillGetToThePump(TestCase) :

	def test_the_function_exist(makaveli) :
		task_four.getTheMilliage(98,88)

	def test_the_function_dont_accept_string(makaveli) :
		makaveli.assertRaises(ValueError, task_four.getTheMilliage,(2.44), (77.33))