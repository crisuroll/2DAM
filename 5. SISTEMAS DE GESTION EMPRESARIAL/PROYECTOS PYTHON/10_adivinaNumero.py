import random

numero_secreto = random.randint(1, 10)
intentos = 0

print("¡Adivina el número secreto entre 1 y 10!")

while True:
    intento = int(input("Ingresa tu número: "))
    intentos += 1

    if intento == numero_secreto:
        print("¡Felicidades! Adivinaste el número en ", intentos, " intentos.")
        break;
    elif intento < numero_secreto:
        print("Demasiado bajo. Intenta de nuevo.")
    else:
        print("Demasiado alto. Intenta de nuevo.")