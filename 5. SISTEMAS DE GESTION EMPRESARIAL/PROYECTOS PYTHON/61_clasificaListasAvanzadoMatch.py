lista = []
i = 0
pos = 0
neg = 0

print("Vas a añadir elementos a la lista. (Introduce cualquier tipo de dato, pulsa '0' para salir)")

while i != '0':
    i = input("Introduce un elemento en la lista. Pulsa '0' para salir: ")
    if i != '0':
        lista.append(i)

print(lista)

for i in lista:
    try:
        num = float(i)
        if num >= 0:
            pos += 1
        else:
            neg += 1
    except ValueError:
        continue

match lista:
    case _ if len(lista) == 0:
        print("Lista vacía.")
    case _ if len(lista) == pos:
        print("Solo números positivos.")
    case _ if len(lista) == neg:
        print("Solo números negativos.")
    case _ if len(lista) == pos + neg:
        print("Números positivos y negativos.")
    case _:
        print("Lista con varios tipos de datos.")

  