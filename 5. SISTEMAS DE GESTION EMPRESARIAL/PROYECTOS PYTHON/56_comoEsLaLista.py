lista = [1, 2]

match len(lista):
    case 0:
        print("Lista vacía.")
    case 1:
        print("Un elemento.")
    case _:
        print("Varios elementos.")