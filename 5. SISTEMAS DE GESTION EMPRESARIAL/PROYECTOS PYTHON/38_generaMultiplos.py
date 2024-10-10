num = int(input("Dime un número: "))
n = int(input("Dime cuántos múltiplos quieres: "))
multiplos = []

for i in range(1, n+1):
    multiplos.append(num*i)

print("Los múltiplos de ", num, " son: ", multiplos)