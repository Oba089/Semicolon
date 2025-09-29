terms = 200000 
pi_approx = 0
results = {}

for k in range(terms):
    pi_approx += ((-1) ** k) / (2 * k + 1)
    approx_value = 4 * pi_approx

    if "3.14" not in results and round(approx_value, 2) == 3.14:
        results["3.14"] = k + 1
    if "3.141" not in results and round(approx_value, 3) == 3.141:
        results["3.141"] = k + 1
    if "3.1415" not in results and round(approx_value, 4) == 3.1415:
        results["3.1415"] = k + 1
    if "3.14159" not in results and round(approx_value, 5) == 3.14159:
        results["3.14159"] = k + 1

    if k < 20:  
        print(f"Term {k+1:<2}: {approx_value}")

print("\nMilestones reached at:")
for key, value in results.items():
    print(f"{key} at term {value}")