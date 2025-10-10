def divide_squares(number):
        
        if number % 5 == 0:
            return number ** 0.5

        if number % 5 != 0:
            return number % 5

print(divide_squares( 10)) 