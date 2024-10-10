lista = [1, 2, 3, 4, 5]
invertida = []
i = 1

while i <= len(lista):
    invertida.append(lista[-i])
    i += 1

print(invertida)