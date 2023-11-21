#area_of_rectangle

rect=lambda l,b:l*b
l=float(input("Enter the Length"))
b=float(input("Enter the Breadth"))
print("Area of Rectangle is: ",rect(l,b))

#area_of_square

square=lambda a:a*a
a=float(input("Enter the Side"))
print("Area of Square with side",a,"is: ",square(a))

#area_of_triangle

triangle=lambda p,q:0.5*p*q
p=float(input("Enter the base: "))
q=float(input("Enter the height: "))
print("Area of Trainagle is: ",triangle(p,q))
