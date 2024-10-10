lista = [1, 1, 2, 3, 3, 2, 3]

# ORDENAMOS LA LISTA

for i in range(len(lista)-1):
    for j in range (0, len(lista)-1):
        if (lista[j] > lista[j+1]):
            lista[j], lista[j+1] = lista[j+1], lista[j]

# CONTAMOS

cont = 0

for i in range(0, len(lista)):
    cont = 0;
    for j in range(0, len(lista)):
        if lista[i] == lista[j]:
            cont += 1;
    if lista[i-1] != lista[i]:
        print(lista[i], ": ", cont)
