lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista_final = []

#lista_final = [1, 4, 2, 5, 3, 6]

for i in range(len(lista1)):
    lista_final.append(lista1[i])
    lista_final.append(lista2[i])

print(lista_final)

lista_final.append(lista1)
lista_final.append(lista2)


# for i1, i2 in zip(lista1, lista2):
#    lista_final.extend([i1, i2])
# print(lista_final)