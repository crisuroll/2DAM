lista1 = []
lista2 = []
i = 1
j = 1

# LISTA 1
print("Vas a añadir números a la lista 1.")
while i != 0:
    i = int(input("Introduce un número en la lista 1. Pulsa 0 para salir: "))
    if i != 0:
        lista1.append(i)

# LISTA 2
print("Vas a añadir números a la lista 2.")
while j != 0:
    j = int(input("Introduce un número en la lista 2. Pulsa 0 para salir: "))
    if j != 0:
        lista2.append(j)

# COMPARAMOS LISTAS
match lista1:
    case _ if lista1 == lista2:
        print("Listas exactamente iguales")
    case _ if sorted(lista1) == sorted(lista2): # es distinto orden
        print("Listas iguales, pero en distinto orden.")
    case _ if len(lista1) != len(lista2):
        print("Listas de diferentes tamaños.")
    case _ if lista1 not in lista2:
        print("No tienen elementos en común.")