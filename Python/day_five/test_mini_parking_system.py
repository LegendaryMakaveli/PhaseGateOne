from unittest import TestCase
import mini_parking_system


class TestTheFunctionThatAddCarToLot(TestCase) :
	def test_the_function_only_accept_integers(makaveli) :
		makaveli.assertRaises(ValueError, mini_parking_system.park_in_the_lot, (8.9))
	
	def test_the_function_dont_accept_string(makaveli) :
		makaveli.assertRaises(ValueError, mini_parking_system.park_in_the_lot, (" "))

	def test_the_function_not_to_accept_negative_number(makaveli) :
		makaveli.assertRaises(ValueError, mini_parking_system.park_in_the_lot, (-1))
	
	def test_the_function_functionality(makaveli) :
		result = mini_parking_system.park_in_the_lot (2)
		makaveli.assertEqual(result, None)


class TestTheFunctionThatRemoveCarFromTheLot(TestCase) :
	def test_the_function_only_accept_integers(makaveli) :
		makaveli.assertRaises(ValueError, mini_parking_system.remove_car_from_lot, (8.9))
	
	def test_the_function_dont_accept_string(makaveli) :
		makaveli.assertRaises(ValueError, mini_parking_system.remove_car_from_lot, (" "))

	def test_the_function_not_to_accept_negative_number(makaveli) :
		makaveli.assertRaises(ValueError, mini_parking_system.remove_car_from_lot, (-1))


class TestTheFunctionThatShowAvailableSpaceAndOccupiedOnes(TestCase) :
	def test_if_the_function_exist_first(makaveli) :
		 mini_parking_system.show_available_space();








