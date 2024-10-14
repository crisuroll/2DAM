lista = [1, 2, 3, 4, -5]
pos = 0

for i in lista:
    if i >= 0:
        pos += 1

if pos == len(lista):
    print("Todos son positivos")