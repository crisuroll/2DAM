# El usuario da dos numeros, hay que dividirlos sin operador de division. Mostrar dividendo, divisor, cociente, resto

dividendo = int(input("Dime el dividendo: "))
divisor = int(input("Dime el divisor: "))
cociente = 0
resto = 0

while((dividendo-divisor) >= 0):
    dividendo = dividendo-divisor
    cociente += 1
    resto = dividendo

print(cociente, resto)
