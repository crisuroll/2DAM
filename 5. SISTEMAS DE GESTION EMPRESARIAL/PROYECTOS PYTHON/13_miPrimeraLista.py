lista = []  # Lista vacía para almacenar los datos 

while True:
    entrada = input("Introduce un número o palabra (escribe 'fin' para terminar): ")
   
    if entrada.lower() == "fin":  # Si el usuario escribe 'fin', se termina el bucle
        break
   
    lista.append(entrada)  # Agrega la entrada a la lista

print("Los elementos en la lista son:", lista)
print("Primer elemento: ", lista[0])
print("Último elemento: ", lista[-1])