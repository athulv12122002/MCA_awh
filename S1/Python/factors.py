def find_factors(x):
    factors = []
    for i in range(1, x+1):
        if x % i == 0:
            factors.append(i)
    print(factors)
x = int(input("Enter a number: "))

if x < 1:
    print("Please enter a positive integer.")
else:
    result = find_factors(x)
    print(f"The factors of {x} are: {result}")
