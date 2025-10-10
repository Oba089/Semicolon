def discount(amount,discount):

	discount_amount = amount - (amount*discount/100)
	return discount_amount

user1 = int(input("Enter discount: "))

user2 = int(input("Enter amount: "))

result = discount(firstuser, seconduser)

print(result)