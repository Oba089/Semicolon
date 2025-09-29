total_miles = 0
total_gallons = 0

while True:
    miles = float(input("Enter miles driven (-1 to quit): "))
    if miles == -1: 
        break

    gallons = float(input("Enter gallons used: "))

    if gallons != 0:
        mpg = miles / gallons
        print(f"Miles per gallon for this tankful: {mpg:.2f}")
    else:
        print("Gallons cannot be zero!")
        continue

    total_miles += miles
    total_gallons += gallons

if total_gallons != 0:
    overall_mpg = total_miles / total_gallons
    print(f"\nOverall miles per gallon for all tankfuls: {overall_mpg:.2f}")
else:
    print("\nNo data entered.")