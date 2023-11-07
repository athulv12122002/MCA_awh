x = int(input("How many Fibonacci numbers: "))
a = 0
b = 1
fibonacci = [a]
print(a)
print(b)
for i in range(1, x):
    a, b = b, a + b  
    print(b)
