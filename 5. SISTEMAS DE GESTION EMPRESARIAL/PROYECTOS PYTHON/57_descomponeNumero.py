num = input("Dime un número de 1 a 3 dígitos: ")

# 323: 3*10^2, 2*10^1, 3*10^0

match len(num):
    case 1:
        print("Unidades: ", num[0])
    case 2:
        print("Decenas: ", num[0])
        print("Unidades: ", num[1])
    case 3:
        print("Centenas: ", num[0])
        print("Decenas: ", num[1])
        print("Unidades: ", num[2])
    case _:
        print("Número inválido.")