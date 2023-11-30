from Graphics.circle import *
r=int(input("Enter the Radius of the circle: "))
print("")
print("The area of circle is", circle_area(r))
print("The perimeter of circle is", circle_peri(r))

print("")
print("")

from Graphics.rectangle import*
l=int(input("Enter the Length: "))
b=int(input("Enter the Breadth: "))
print("")
print("The Area of Rectangle is: ",rect_area(l,b))
print("The Perimeter of Rectangle is: ",rect_peri(l,b))

print("")
print("")

from Graphics.D_graphics.cuboid import *
l=int(input("Enter the Length: "))
b=int(input("Enter the Breadth: "))
h=int(input("Enter the Height: "))
print("")
print("The Area of Cuboid is: ",cuboid_area(l,b,h))
print("The Perimeter of Cuboid is: ",cuboid_peri(l,b,h))

print("")
print("")

from Graphics.D_graphics.sphere import *
r=int(input("Enter the Radius of the Sphere: "))
print("")
print("The area of Sphere is", sphere_area(r))
print("The perimeter of Sphere is", sphere_peri(r))
