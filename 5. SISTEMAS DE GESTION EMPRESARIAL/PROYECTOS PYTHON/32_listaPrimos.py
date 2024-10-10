primos = []
num = int(input("Dime un número: "))

for i in range(1, num + 1):
    cont = 0;
    for j in range(1, i + 1):
        if (i%j == 0):
            cont += 1
    if (cont == 2):
        primos.append(i)

print(primos)
