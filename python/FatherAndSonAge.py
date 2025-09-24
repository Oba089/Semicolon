father = int(input("Father's age: "))
son = int(input("Son's age: "))

if not (1 <= father <= 80 and 1 <= son <= 80):
    print("Ages must be between 1 and 80.")
elif father <= son:
    print("Father must be older than son.")
elif father == 2 * son:
    print("Right now, father is twice as old as son.")
elif father > 2 * son:
    print(f"{father - 2*son} years ago, father was twice as old as son.")
else:
    print(f"In {2*son - father} years, father will be twice as old as son.")

