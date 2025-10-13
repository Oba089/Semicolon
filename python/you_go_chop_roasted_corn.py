


def add_ing_or_ly(s):

    	if len(s) < 3:
        return s

    	elif s.endswith('ing'):
        return s + 'ly'

    	else:
        return s + 'ing'


print(add_ing_or_ly('play'))


def longest_word(words):

    	if not words:
        return None, 0
    	longest = max(words, key=len)
    	return longest, len(longest)

	word_list = ['apple', 'banana', 'cherry', 'watermelon']
	word, length = longest_word(word_list)


print(f"The longest word is '{word}' with length {length}.")



def find_min_number(numbers):

    if not numbers:

        return None

    return min(numbers)

print(find_min_number([-3, 0, 4, -10]))


def repeat_string(s, n):

    if isinstance(n, float): 

        return s

    return s * n



print(repeat_string("hello", 3))


def square_elements(numbers):

    return [x**2 for x in numbers]




print(square_elements([1, 2, 3, 4, 5]))


def sum_of_squares(numbers):

    return sum(x**2 for x in numbers)



print(sum_of_squares([1, 2, 3, 4]))
