binary = int(input("Enter a binary number: "))
decimal = 0
power = 0 

while binary > 0:
    last_digit = binary % 10       
    decimal += last_digit * (2 ** power)  
    binary = binary // 10             
    power += 1                   

print("Decimal equivalent:", decimal)