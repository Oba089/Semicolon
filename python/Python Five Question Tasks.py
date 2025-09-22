1.
Enter a name
If name is equal to "Alex" then
Display "Hello, friend!" Else Display "Hi, stranger!"

# Greeting Chooser

name = input("Enter your name: ")

if name == "Alex":
    print("Hello, friend!")
else:
    print("Hi, stranger!")

2.
Select pet
If pet is equal to "dog" then
Display "Woof! Dogs are awesome!" or display "Cool choice, but I love dogs!"


pet = input("Enter your favorite pet: ")

if pet == "dog":
    print("Woof! Dogs are awesome!")
else:
    print("Cool choice, but I love dogs!")


3.
 Select favorite_number = 7
 Input guess
 If guess equals favorite_number then
 Display "That’s my favorite number!" else display "Nice try, guess again!"

favorite_number = 7  

guess = int(input("Guess my favorite number: "))

if guess == favorite_number:
    print("That's my favorite number!")
else:
    print("Nice try, guess again!")

4.
Choose number from 1 to 5 
Count the "Number:", number

for number in range(1, 6):  # counts 1, 2, 3, 4, 5
    print("Number:", number)



5.
Enter a number
If number % 2 == 0 then
Display "EVEN", display "ODD"

number = int(input("Enter a number: "))

if number % 2 == 0:
    print("EVEN")
else:
    print("ODD")
