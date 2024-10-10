temp = float(input("Introduce la temperatura: "))

ud = int(input("¿Está en Farenheit o Celsius? (1/2): "))

if (ud == 1):
    tempc = (temp-32)*5/9
    print(temp, " ºF son ", tempc, "ºC")
elif (ud == 2):
    tempf = (temp*9/5)+32
    print(temp, " ºC son ", tempf, "ºF")
else:
    print("Opción no válida.")