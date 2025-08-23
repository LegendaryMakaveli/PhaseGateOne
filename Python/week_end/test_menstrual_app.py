from unittest import TestCase
import menstrual_app


class TestTheFunctionThatCalculateMenstrualFlow(TestCase) :	
	def test_the_function_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (89.98), 23.33)

	def test_that_the_second_argument_dont_accept_integers(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (32),87)

	def test_that_first_augument_dont_accept_string(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, ("ikka"),"ikka")

	def test_that_first_augument_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (47.89),"ikka")

	def test_for_empty_day_input(makaveli):
        	makaveli.assertRaises(TypeError, menstrual_app.calculate_menstrual_flow, None, "ikka")

	def test_for_empty_month_input(makaveli):
        	makaveli.assertRaises(TypeError, menstrual_app.calculate_menstrual_flow, 23, None)

	def test_for_invalid_month_string(makaveli):
        	result = menstrual_app.calculate_menstrual_flow(23, "ikka")
        	makaveli.assertIsNone(result)

	def test_for_valid_input(makaveli):
        	result = menstrual_app.calculate_menstrual_flow(23, "ikka")
        	makaveli.assertIsNone(result)


class TestTheFunctionThatCalculateOvulationFlow(TestCase) :	
	def test_the_function_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (89.98), 23.33)

	def test_that_the_second_argument_dont_accept_integers(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (32),87)

	def test_that_first_augument_dont_accept_string(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, ("ikka"),"ikka")

	def test_that_first_augument_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (47.89),"ikka")

	def test_for_empty_day_input(makaveli):
        	makaveli.assertRaises(TypeError, menstrual_app.calculate_menstrual_flow, None, "ikka")

	def test_for_empty_month_input(makaveli):
        	makaveli.assertRaises(TypeError, menstrual_app.calculate_menstrual_flow, 23, None)

	def test_for_invalid_month_string(makaveli):
        	result = menstrual_app.calculate_menstrual_flow(23, "ikka")
        	makaveli.assertIsNone(result)

	def test_for_valid_input(makaveli):
        	result = menstrual_app.calculate_menstrual_flow(23, "ikka")
        	makaveli.assertIsNone(result)




class TestTheFunctionThatCalculateSafeDays(TestCase) :	
	def test_the_function_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (89.98), 23.33)

	def test_that_the_second_argument_dont_accept_integers(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (32),87)

	def test_that_first_augument_dont_accept_string(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, ("ikka"),"ikka")

	def test_that_first_augument_dont_accept_float(makaveli) :
		makaveli.assertRaises(ValueError, menstrual_app.calculate_menstrual_flow, (47.89),"ikka")

	def test_for_empty_day_input(makaveli):
        	makaveli.assertRaises(TypeError, menstrual_app.calculate_menstrual_flow, None, "ikka")

	def test_for_empty_month_input(makaveli):
        	makaveli.assertRaises(TypeError, menstrual_app.calculate_menstrual_flow, 23, None)

	def test_for_invalid_month_string(makaveli):
        	result = menstrual_app.calculate_menstrual_flow(23, "ikka")
        	makaveli.assertIsNone(result)

	def test_for_valid_input(makaveli):
        	result = menstrual_app.calculate_menstrual_flow(23, "ikka")
        	makaveli.assertIsNone(result)










