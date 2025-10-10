def future_investment(investment_amount, monthly_interest_rate, yearly):

	number_of_months = yearly * 12

	future_investment_values = investment_amount * (1 + monthly_interest_rate) ** number_of_months

	return round(future_investment_values, 2)

print(future_investment_(1000, 0.01, 5))