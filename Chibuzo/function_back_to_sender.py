def calculate_rider_payment(delivery_is_successful):

	if delivery_is_successful < 50:
		output = delivery_is_successful*160 
		rate = 80
	elif 50 <= delivery_is_successful <= 59:
		output = delivery_is_successful*200 
		rate = 160
	elif 60 <= delivery_is_successful <= 69:
		output = delivery_is_successful*250
		rate = 250
	else:
		output = delivery_is_successful*500

		return output + 5000



