num1 = int(input("Dime la tabla que quieres: "))
num2 = int(input("Dime hasta qué número multiplicar: "))

aux = 0

for i in range(num2+1):
    print(num1, " x ", i, " = ", num1*i)