lista = [1, 2, 2, 3, 4]
num1 = int(input("Ingresa un número de la lista: "))
num2 = int(input("¿Por cuál quieres reemplazarlo?: "))

for i in range(len(lista) - 1):
    if lista[i] == num1:
        lista[i] = num2

print(lista)