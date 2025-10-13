1.
def find_smallest(numbers):
  
  if not numbers:
    return None

  smallest = numbers[0]

  for number in numbers:
    if number < smallest:
      smallest = number

  return smallest


print(f"The smallest number is: {smallest(number)}")average array(int[]

2.

def averageArray(numbers):

    if not numbers:
        return 0.0
    
    return sum(numbers) / len(numbers)

print(f"The average is: {averageArray(my_list)}")

3.

def countOccurence(number, target):
   
    count = 0
    
    
    for element in arr:
        
        if element == target:
           
            count += 1
            
    return count

    numbers = [1, 5, 3, 5, 2, 5, 8, 5]
    target = 5

print(f"The number {target} appears {countOccurence(numbers, target)} times.")

4.

def containsElement(array, target):
 
  return target in array
  numbers = [10, 20, 30, 40, 50]

  firsttarget = 30
  print(f"Does the list contain {target1}? {containsElement(numbers, target1)}")

  secondtarget = 99

print(f"Does the list contain {target2}? {containsElement(numbers, target2)}")


5.
def get_first_element(array):

	if len(array) == 0:
        return 0

print(get_last_element([10, 20, 30]))
print(get_last_element([]))


6.
def get_last_element(array):
    if len(arr) == 0:
        return 0
    return arr[-1]

print(get_last_element([10, 20, 30]))
print(get_last_element([]))


7.

def count_elements(array):
    count = 0
    for _ in array:
        count += 1
    return count

print(count_elements([10, 20, 30, 40])) 
print(count_elements([]))

8.

def get_middle_element(array):

    if not array:
        return None 

    middle_index = len(array) // 2

    if len(array) % 2 == 0:
        return array[middle_index - 1]  
    else:
        return array[middle_index]  

print(get_middle_element([10, 20, 30]))       
print(get_middle_element([10, 20, 30, 40]))     
print(get_middle_element([100]))            
print(get_middle_element([]))              

9.

def swap_first_and_last(array):
    if len(arr) < 2:
        return arr[:]  

    result = arr[:]  
    result[0], result[-1] = result[-1], result[0]  
    return result


	original = [10, 20, 30, 40, 50]
	swapped = swap_first_and_last(original)

print("Original:", original)
print("Swapped: ", swapped)