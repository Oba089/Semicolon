# Arithmetic, Smallest and Largest for four integers

numbers = []  # list to store the integers

# Input loop for 4 integers
for i in range(4):
    num = int(input(f"Enter integer {i+1}: "))
    numbers.append(num)

total = sum(numbers)
average = total / len(numbers)
product = 1
for n in numbers:
    product *= n

smallest = min(numbers)
largest = max(numbers)

print(f"\nSum: {total}")
print(f"Average: {average}")
print(f"Product: {product}")
print(f"Smallest: {smallest}")
print(f"Largest: {largest}")