lista = [5, 5, 4, 3, 1, 3, 0]
lista2 = []

lista.sort()

for i in range(len(lista)-1):
    if lista[i] != lista[i+1]:
        lista2.append(lista[i])

lista2.append(lista[-1])

print(lista2)