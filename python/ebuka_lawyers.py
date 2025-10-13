1.

def (random):

	random_numbers = []

		for _ in range(10):

    	number = random.int(1, 50)
   
    		append(number)



print(random_numbers)


2.

def get_length(list):

	count = 0
    	for _ in my_list:

        count += 1
    	return count

	length = get_length(list)


print(f"The length of the list is: {length}")


3.

def sum_even_positions(lst):

	return sum(lst[i] for i in range(0, len(lst), 2))


	my_list = [10, 20, 30, 40, 50]
		result = sum_even_positions(my_list)


print(result)


4.

def sum_odd_positions(lst):

	return sum(lst[i] for i in range(1, len(lst), 2))

	my_list = [10, 20, 30, 40, 50]

	result = sum_odd_positions(my_list)



print(result)  


5.

def multiply_every_third(lst):

    product = 1

    for i in range(0, len(lst), 3):
        product *= lst[i]

    return product


	my_list = [2, 5, 3, 7, 8, 1, 4, 6, 9]
	result = multiply_every_third(my_list)


print(result) 

6.

def average():
    
    random_numbers = [random.randint(1, 50) for _ in range(10)]
    
    
    average = sum(random_numbers) / len(random_numbers)
    
    
print("Random numbers:", random_numbers)
print("Average:", average)


7.

def largest():
    
    random_numbers = [random.randint(1, 50) for _ in range(10)]
    
    
    average = sum(random_numbers) / len(random_numbers)
    
    
    largest = max(random_numbers)
    
    



print("Random numbers:", random_numbers)
print("Average:", average)
print("Largest element:", largest)




8.

def smallest():
    
    random_numbers = [random.randint(1, 50) for _ in range(10)]
    
    
    average = sum(random_numbers) / len(random_numbers)
    
    
    largest = max(random_numbers)
    smallest = min(random_numbers)
    
    


print("Random numbers:", random_numbers)
print("Average:", average)
print("Largest element:", largest)
print("Smallest element:", smallest)


9.

def count_and_return_strings(strings):

    	result = []

    	for s in strings:

        if len(s) >= 2 and s[0] == s[-1]:
            result.append(s)

    	return result


	string_list = ["level", "test", "noon", "a", "wow", "python", "aa"]

	matching_strings = count_and_return_strings(string_list)


print("Matching strings:", matching_strings)
print("Count:", len(matching_strings))


10.

numbers = list(range(1, 16))


print(numbers)





11.

def sum_every_third_element(lst):

    	return sum(lst[i] for i in range(2, len(lst), 3))


	my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	result = sum_every_third_element(my_list)



print("Sum of every third element:", result)


12.

def sum_first_middle_last(lst):

    if not lst:
        return 0  # Return 0 if the list is empty
    
    first = lst[0]
    last = lst[-1]
    middle_index = len(lst) // 2
    middle = lst[middle_index]
    
    return first + middle + last


my_list = [10, 20, 30, 40, 50]
result = sum_first_middle_last(my_list)



print("Sum of first, middle, and last elements:", result)



