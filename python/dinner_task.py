1.

for number in range(2, 101, 2):
    print(number, end=' ')

2.

for number in range(51, 100, 2):
    print(number)

3.

for number in range(100, 0, -1):
    print(i)

4.

for number in range(1, 21):
    print(f"Square of {number} is {number * number}")

5.

for number in range(1, 51):
    if number % 3 == 0:
        print(number)

6.

for number in range(1, 101):
    if number % 3 == 0 and number % 5 == 0:
        print(number)
7.

count = 0
for count in range(1, 101):
    if count % 7 == 0:
        count += 1

print(f"Count of numbers divisible by 7 between 1 and 100: {count}")

8.

sum = 0
for number in range(1, 51):
    sum += number

print(f"Sum of the first 50 natural numbers: {sum}")

9.

product = 1
for number in range(1, 11):
    product *= number

print(f"Product of the first 10 natural numbers: {product}")

10.

for c in range(ord('A'), ord('Z') + 1):
    print(chr(c), end=" ")
print()

11.

number = 7 
for i in range(1, 11):
    print(f"{number} x {i} = {number * i}")

12.

str = "Good, Morning!"
for char in str:
    print(char)

13.

input_str = "The wait is over."
count = input_str.count('e')
print("Number of 'e's:", count)

14.

input_str = "Glory Hallelujah!"
result = ""

for char in input_str:
    if 'a' <= char <= 'z':
   
        result += chr(ord(char) - 32)
    else:
        result += char

print(result)

15.

input_str = "GoOD morNING!"
result = ""

for char in input_str:
    if 'A' <= char <= 'Z':
        # Convert to lowercase using ASCII value
        result += chr(ord(char) + 32)
    else:
        result += char

print("Original:", input_str)
print("Lowercase:", result)

16.

input_str = "Beautiful Day!"
vowels = "aeiouAEIOU"
count = 0

for char in input_str:
    if char in vowels:
        count += 1

print("Original:", input_str)
print("Number of vowels:", count)

17.

number = 345678
count = 0
temp = abs(number) 

if temp == 0:
    count = 1
else:
    while temp > 0:
        temp //= 10
        count += 1

print("Number:", number)
print("Digit count:", count)

18.

number = 34567
sum_of_digits = sum(int(digit) for digit in str(number))
print("Sum of digits:", sum_of_digits)

19.

umber = 739245
largest_digit = max(int(digit) for digit in str(number))
print("Largest digit:", largest_digit)

20.

number = 739245
smallest_digit = min(int(digit) for digit in str(number))
print("Smallest digit:", smallest_digit)


