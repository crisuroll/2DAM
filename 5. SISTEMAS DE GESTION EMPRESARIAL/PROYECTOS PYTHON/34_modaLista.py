lista = [4, 5, 55, 4, 9]

# LA MODA ES EL VALOR MAS REPETIDO EN UNA LISTA

for i in range(len(lista)-1):
    if lista.count(lista[i]) >= lista.count(lista[i+1]):
        moda = lista[i]

print(moda)