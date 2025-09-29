# Triangle patterns side by side (Python version)

n = 10  # Height of triangles

for i in range(1, n + 1):

    # Pattern A (left-aligned increasing)
    for j in range(1, i + 1):
        print("*", end="")
    for j in range(i, n):
        print(" ", end="")

    print("   ", end="")  # 3 spaces between patterns

    # Pattern B (left-aligned decreasing)
    for j in range(i, n + 1):
        print("*", end="")
    for j in range(1, i):
        print(" ", end="")

    print("   ", end="")

    # Pattern C (right-aligned increasing)
    for j in range(1, n - i + 1):
        print(" ", end="")
    for j in range(1, i + 1):
        print("*", end="")

    print("   ", end="")

    # Pattern D (right-aligned decreasing)
    for j in range(1, i):
        print(" ", end="")
    for j in range(i, n + 1):
        print("*", end="")

    print()  # End of row