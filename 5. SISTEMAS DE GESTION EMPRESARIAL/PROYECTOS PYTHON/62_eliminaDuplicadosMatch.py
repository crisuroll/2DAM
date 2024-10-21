lista = []

lista.append([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
lista.append([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
lista.append([1, 2, 3, 4, 10])
lista.append([1, 2, 3, 4, 10])

print("Lista original:", lista)

match lista:
    case _ if len(lista) == 0:
        print("Lista vacía.")
    case _ if any(lista.count(sublista) > 1 for sublista in lista):
        print("Listas duplicadas.")
        lista2 = []
        for sublista in lista:
            if sublista not in lista2:
                lista2.append(sublista)
        lista = lista2
    case _:
        print("No hay listas duplicadas.")

print("Lista final:", lista)
