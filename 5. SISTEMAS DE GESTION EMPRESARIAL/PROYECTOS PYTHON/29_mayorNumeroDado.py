# Dada una lista con 20 números, el programa localizará los valores mayores, no iguales, que un número dado por el usuario. 
# Finalmente mostrará ordenados de menor a mayor los valores que cumplan la condición y el valor mayor de todos.

lista = [2, 3, 5, 6, 88, 2, 109, 45, 7, 7, 23, 55, 0, 23, 4, 32, 12, 8, 34, 20]
num = int(input("Dame un número: "))
mayores = []

lista.sort()

for i in range(len(lista)):
    if lista[i] > num:
        mayores.append(lista[i])

print("Los mayores son: ", mayores)
print("El más grande es: ", mayores[-1])