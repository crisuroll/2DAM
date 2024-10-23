numeros = [10, 30, 15, 2, 45, 60, 5, 100, 35]

num1 = numeros[0]
num2 = numeros[1]

for i in numeros:
    if i > num1:
        num2 = num1
        num1 = i
    elif i > num2 and i != num1:
        num2 = i

print("El segundo número más grande es:", num2)
