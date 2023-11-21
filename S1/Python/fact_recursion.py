def fact(x):
    if x==1:return 1
    else:return(x*fact(x-1))
num=int(input("Enter the number to find the Factorial: "))
if num>=1:
   print("factorial of",num,"is",fact(num))
