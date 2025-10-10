def find_smallest(numbers):
  
  if not numbers:
    return None

  
  smallest = numbers[0]

  for number in numbers:
    if number < smallest:
      smallest = number

  return smallest


print(f"The smallest number is: {smallest(number)}")average array(int[]


def averageArray(numbers):

    if not numbers:
        return 0.0
    
    return sum(numbers) / len(numbers)

print(f"The average is: {averageArray(my_list)}")


def countOccurence(number, target):
   
    count = 0
    
    
    for element in arr:
        
        if element == target:
           
            count += 1
            
    return count

    numbers = [1, 5, 3, 5, 2, 5, 8, 5]
    target = 5

    print(f"The number {target} appears {countOccurence(numbers, target)} times.")

def containsElement(array, target):
 
  return target in array
  numbers = [10, 20, 30, 40, 50]

  firsttarget = 30
  print(f"Does the list contain {target1}? {containsElement(numbers, target1)}")

  secondtarget = 99
  print(f"Does the list contain {target2}? {containsElement(numbers, target2)}")
