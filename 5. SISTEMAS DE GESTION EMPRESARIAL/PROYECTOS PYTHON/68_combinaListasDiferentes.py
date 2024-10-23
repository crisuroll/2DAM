lista1 = [1, 2, 3]
lista2 = ['a', 'b']

final = []

for i in range(len(lista1) + len(lista2)):
    if i < len(lista1) and i < len(lista2):
        final.append((lista1[i], lista2[i]))
    elif i < len(lista1):
        final.append((lista1[i], None))
    elif i < len(lista2):
        final.append((None, lista2[i]))

print(final)