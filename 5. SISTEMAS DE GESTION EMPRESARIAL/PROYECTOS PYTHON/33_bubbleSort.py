lista = [4, 2, 7, 23, 13, 8]

for i in range(len(lista)-1):
    for j in range (0, len(lista)-1):
        if (lista[j] > lista[j+1]):
            lista[j], lista[j+1] = lista[j+1], lista[j]

print(lista)