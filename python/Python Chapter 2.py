1.

Pseudocode 
x = 2
y = 3  
Display ("x =", x), ("Value of", x, "+", x, "is", x + x), ("x ="), ((x + y), "=", (y + x))

x =2 
print('x =', x) 

x =2 
print('Value of', x, '+', x, 'is', (x + x))

x =2 
C. print('x =')

x =2 
y = 3  
D. print((x + y), '=', (y + x))


2.
rating = int(input('Enter an integer rating between 1 and 10: '))

3.
if grade >= 90:
    print('Congratulations! Your grade of', grade, 'earns you an A in this course')

4.
Pseudocode
Arithmetic operators +, -, *, /, // and **
Display the value of an expression


Left operand 27.5 
Right operand 2

27.5 + 2 = 29.5

27.5 - 2 = 25.5

27.5 * 2 = 55.0

27.5 / 2 = 13.75

27.5 // 2 = 13.0

27.5 ** 2 = 756.25

5.
Pseudocode
Input the value of radius = 2, pi = 3.14159
Calculate the Diameter = 2 * radius, Circumference = 2 * pi * radius, Area = pi * radius * radius
Display "Diameter =", diameter, "Circumference =", circumference, "Area =", area

Diameter = 2 × r
Circumference = 2 × π × r
Area = π × r²
Diameter = 2 × 2 = 4
Circumference = 2 × 3.14159 × 2 = 12.56636
Area = 3.14159 × (2²) = 3.14159 × 4 = 12.56636

6.
Pseudocode
Enter number
If number % 2 == 0
Display the even number, display the odd number
Enter an integer
Print the number is even or else  number is odd


num1 = 1024
num2 = 4
If (num1 % num2 == 0) thenDisplay "1024 is a multiple of 4"
Else
    Display "1024 is not a multiple of 4"

Set num3 = 2
Set num4 = 10
If (num3 % num4 == 0) then
    Display "2 is a multiple of 10"
Else
    Display "2 is not a multiple of 10"


7.
Pseudocode
Display "number   square   cube" number from 0 to 5 
Calculate the square, cube,
Print number, square, cube

print("number\tsquare\tcube")

for n in range(6):
    print(n, "\t", n*2, "\t", n*3)


8.
Pseudocode
Display the integer equivalents of B C D b c d 0 1 2 $ * + and the space character.
char = ['B', 'C', 'D', 'b', 'c', 'd', '0', '1', '2', '$', '*', '+', ' ']
Print

ord: In [1] : ord("A")
Out [1] : 65


char = ['B', 'C', 'D', 'b', 'c', 'd', '0', '1', '2', '$', '*', '+', ' ']

for ch in chars:
    print(ch, "=", ord(ch))

9.
#Pseudo code 
Enter the three numbers
Calculate for sum, average, product, smallest, largest
Print the results

num1 = int(input("Enter first integer: "))
num2 = int(input("Enter second integer: "))
num3 = int(input("Enter third integer: "))

sum_val = num1 + num2 + num3
average = sum_val / 3
product = num1 * num2 * num3
smallest = min(num1, num2, num3)
largest = max(num1, num2, num3)

print("Sum =", sum_val)
print("Average =", average)
print("Product =", product)
print("Smallest =", smallest)
print("Largest =", largest)


10.
Pseudo code 
Input a five-digit integer
Extract digits
Display digits separated by 3 spaces

num = int(input("Enter a five-digit integer: "))

digit1 = num // 10000
digit2 = (num % 10000) // 1000
digit3 = (num % 1000) // 100
digit4 = (num % 100) // 10
digit5 = num % 10

print(digit1, digit2, digit3, digit4, digit5, sep="   ")

11.
Pseudo code 
Input p = 1000           
Input r = 0.07           
Calculate a = p * (1 + r) ^ n
Print "After", n, "years: $", a

p = 1000   
r = 0.07       

for n in [10, 20, 30]:
    a = p * (1 + r) ** n
    print(f"After {n} years: ${a:.2f}")

12.

Pseudocode

input number a large number
Display number
Python does not reject large integers.
Only computer memory limits how big the number can be.

13.
Pseudocode
Input user's age
Calculate maximum heart rate
Calculate target heart rate range (50% to 85% of max_rate)
Show results

age = int(input("Enter your age: "))

maxiumum_rate = 220 - age
target_lower = 0.50 * maximum_rate
target_upper = 0.85 * maxium_rate

print("Maximum heart rate =", max_rate, "bpm")
print(f"Target heart rate range = {target_lower:.1f} - {target_upper:.1f} bpm")
