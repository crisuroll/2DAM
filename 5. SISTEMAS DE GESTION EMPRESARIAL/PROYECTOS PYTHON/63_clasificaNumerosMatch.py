lista = [1, "hola", 3.14, True, 42, "mundo", False]

enteros = []
cadenas = []
booleanos = []
otros = []

for i in lista:
    match i:
        case bool():
            booleanos.append(i)
        case int():
            enteros.append(i)
        case str():
            cadenas.append(i)
        case _:
            otros.append(i)

print("Números enteros:", enteros)
print("Cadenas de texto:", cadenas)
print("Booleanos:", booleanos)
print("Otros tipos de datos:", otros)
