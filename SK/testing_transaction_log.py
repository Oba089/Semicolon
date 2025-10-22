import unittest

from transactions, deposit, withdraw, history

class TransactionLogApp(unittest.Test):

	def testing_transaction_functions(self):

    		balance = 0
    		transactions = []
   
    		self.assertequals(len(transaction), 0)
    		deposit(10000, balance =0, transactions)
    		
    		self.assertequals(len(transaction), 1)
    		withdraw(4000, balance, transactions)
    		
    		self.assert balance == 6000
    		balance = withdraw(6000, balance, transactions)
    		
    		
    		print("\n Testing History...")
    		history(transactions)

    		
if __name__ == "__main__":
    unittest.main()

