def main_menu():

	balance = 0
   
	while True:

		print(""" 
Welcome to Transaction Log App	
1. Deposit		
2. Withdraw	
3. Show Transactions	
4. Exit
""")
	option = input("Enter your choice: ")
        
def deposit():
	if option == '1':
		amount = int(input("Enter deposit amount: "))
		balance += amount
		transactions.append(f"Deposited: {deposit_amount} | New Balance: {balance}")

		print(f"Deposited: {amount} | New Balance: {balance}")

def withdraw():
	elif (option) == '2':
		amount = int(input("Enter withdrawal amount: "))
		if amount <= balance:
		balance -= amount
		transactions.append(f"Withdrew: {withdraw_amount} | New Balance: {balance}")

		print(f"Withdrew: {amount} | New Balance: {balance}")
		
	else:
	   	print("Insufficient balance!")


def show_transaction();
        
	elif (option) == '3':
	  	print("Transactions so far:")

	if not transactions:

		print("No transactions yet.")

	else:
                
	for i, transaction in enumerate(transactions, 1):
                    
		print(f"{i}. {transaction}")
               
	elif (option) == '4':

		print(f"Final Balance: {balance}")
		print("Thank you for using Transaction Log App!")
            	break

	else:
		print("Invalid option! Please try again.")