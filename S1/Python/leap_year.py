current_year = 2023
end_year = int(input("Enter the End year: "))
print("Leap years from ",current_year,"to", end_year,"are :")
while current_year <= end_year:
    if current_year % 4 == 0:
        print(current_year)
    current_year += 1
    
