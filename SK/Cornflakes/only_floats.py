def on_floats(a, b):
    count = 0
    if (a) is float:
        count += 1

    if (b) is float:
        count += 1

    return count

print(on_floats(12.1, 23))
print(on_floats(12.1, 23.5))
print(on_floats(12, 23))