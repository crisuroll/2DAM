lista = ["hola", "mundo", "owo"]
palabras = {}
j=1

for i in lista:
    palabras2 = {j:i}
    palabras.update(palabras2)
    j+=1

print(palabras)