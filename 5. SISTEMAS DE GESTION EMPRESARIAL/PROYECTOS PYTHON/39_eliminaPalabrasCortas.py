lista = ["hola", "mundo", "awawawa", "eee", "aa"]

for palabra in lista[:]:
    if len(palabra) < 4:
        lista.remove(palabra)

print(lista)
