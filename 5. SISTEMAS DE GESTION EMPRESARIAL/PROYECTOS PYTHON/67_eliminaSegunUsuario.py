lista = [1, 1, 2, 3, 4]

num = int(input("Dime un número: "))

lista2 = []

for i in lista:
    if lista.count(i) < num:
        lista2.append(i)

print(lista2)