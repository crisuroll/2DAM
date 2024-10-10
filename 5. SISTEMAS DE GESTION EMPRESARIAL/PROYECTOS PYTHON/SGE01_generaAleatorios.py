rp = int(input("Dime dónde empieza el rango: "))
rf = int(input("Dime cuántos quieres generar: "))
cantidad = int(input("Dime cuántos quieres generar: "))

rango = []

# GUARDAR NÚMEROS DEL RANGO
for i in range(rp, rf+1):
    rango.append(i)

random = []

long = len(rango)

# GENERAR ALEATORIOS
for i in range(cantidad):
    index = (i * 3 + cantidad) % long
    random.append(rango[index])

print(random)
