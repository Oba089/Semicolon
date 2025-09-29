largest = float("-inf")       
second_largest = float("-inf")

for i in range(1, 11): 
    num = float(input(f"Enter number {i}: "))

    if num > largest:
        second_largest = largest
        largest = num
    elif num > second_largest and num != largest:
        second_largest = num

print(f"\nThe largest number is: {largest}")
print(f"The second largest number is: {second_largest}")