# Importing CMath
import cmath

# Take input for the coefficients of the quadratic equation
a = float(input("Enter the coefficient of x^2: "))
b = float(input("Enter the coefficient of x: "))
c = float(input("Enter the constant term: "))

# Calculate the discriminant
d = (b**2) - (4*a*c)

# Find the roots of the equation using the quadratic formula
root1 = (-b - cmath.sqrt(d)) / (2*a)
root2 = (-b + cmath.sqrt(d)) / (2*a)

# Print the roots
print("The roots of the quadratic equation are: ")
print(root1)
print(root2)
