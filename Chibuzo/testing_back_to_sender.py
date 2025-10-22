import unittest
from function_back_to_sender import *
class test_back_to_sender(unittest.TestCase):

	def test_the_rider_payment(self):
		to_get_payment_per_delivery(delivery_is_successful):

	def test_to_get_payment_per_delivery_less_than_50(self):
		expected = 40000
		actual = to_get_payment_per_delivery(50)
		self.assertEqual(expected,actual)
		

	def test_to_get_payment_per_delivery_less_than_and_equals_to_50_less_than_and_equals_to_59(self):
		expected = 48900
		actual = to_get_payment_per_delivery(59)
		self.assertEqual(expected,actual)

	def test_to_get_payment_per_delivery_less_than_and_equals_to_60_less_than_and_equals_to_69(self):
		expected = 50900
		actual = to_get_payment_per_delivery(69)
		self.assertEqual(expected,actual)

	def test_to_get_payment_per_delivery_greater_than_70(self):
		expected = 650000
		actual = to_get_payment_per_delivery(70)
		self.assertEqual(expected,actual)
		


	
