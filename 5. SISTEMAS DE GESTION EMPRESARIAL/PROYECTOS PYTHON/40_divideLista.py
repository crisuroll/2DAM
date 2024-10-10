lista = [1, 2, 3, 4, 5]
menores = []
mayores = []
num = int(input("Dime un número: "))

for i in lista:
    if i >= num:
        mayores.append(i)
    else:
        menores.append(i)

print(menores)
print(mayores)