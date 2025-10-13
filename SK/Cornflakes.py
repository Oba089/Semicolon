def is_palindrome_prime(n: int) -> bool:
    if n < 2:
        return False 

    if str(n) != str(n)[::-1]:
        return False

    if n == 2:
        return True
    if n % 2 == 0:
        return False

    for i in range(3, isqrt(n) + 1, 2):
        if n % i == 0:
            return False

    return True

print(is_palindrome_prime(252))  
print(is_palindrome_prime(242))  
print(is_palindrome_prime(22))   
print(is_palindrome_prime(2))    
print(is_palindrome_prime(-252)) 


def my_discount(price, discount):
    discounted_price = price - (price * discount / 100)
    return discounted_price

print(my_discount(150, 15))  



def only_floats(a, b):
    count = 0
    if isinstance(a, float):
        count += 1
    if isinstance(b, float):
        count += 1
    return count

print(only_floats(12.1, 23))     
print(only_floats(12.1, 23.5))  
print(only_floats(12, 23))       


def compute_future_investment(investment_amount, monthly_interest_rate, years):

    number_of_months = years * 12

    future_investment_value = investment_amount * (1 + monthly_interest_rate) ** number_of_months

    return future_investment_value


def divide_or_square(number):
    
    if not isinstance(number, (int, float)):
        return "Invalid input: must be an integer or float"
    
    if number % 5 == 0:
       
        if number < 0:
            return
        return round(math.sqrt(number), 2)
    else:
        
        return number % 5

print(divide_or_square(10))      
print(divide_or_square(7))       
print(divide_or_square(-10))     
print(divide_or_square(13.5))    
print(divide_or_square(25.0))