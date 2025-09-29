print("What is your problem?")
problem = input() 

print("Have you had this problem before (yes or no)?")
answer = input().lower()

if answer == "yes":
    print("Well, you have it again.")
elif answer == "no":
    print("Well, you have it now.")
else:
    print("I can only understand 'yes' or 'no'.")