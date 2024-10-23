lista = [3, 55, 14]

num = int(input("Dame un número: "))

cercano = lista[0]

for i in lista:
    if abs(i - num) < abs(cercano - num):
        cercano = i

print("El número más próximo es: " , cercano)
