letra = input("Dime una letra: ")
vocales = ["a","e","i","o","u"]
consonantes = ["b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"]

match letra:
    case _ if letra in vocales:
        print("Es una vocal.")
    case _ if letra in consonantes:
        print("Es una consonante.")
    case _:
        print("Carácter inválido.")