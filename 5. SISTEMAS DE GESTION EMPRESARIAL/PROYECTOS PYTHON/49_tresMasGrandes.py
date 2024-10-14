numeros = [10, 30, 15, 2, 45, 60, 5, 100, 35]

num1 = 0
num2 = 0
num3 = 0

for num in numeros:
    if num > num1:
        num3 = num2
        num2 = num1
        num1 = num
    elif num > num2:
        num3 = num2
        num2 = num
    elif num > num3:
        num3 = num

print(num1, num2, num3)