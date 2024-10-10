num = int(input("Dime de qué número quieres el factorial: "))
fact = 1

for i in range(1, num + 1):
    fact *= i # fact = fact * i
print("El factorial de ", num, " es ", fact)