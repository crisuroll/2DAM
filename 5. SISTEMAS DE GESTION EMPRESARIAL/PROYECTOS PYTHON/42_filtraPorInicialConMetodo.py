palabras = ["sol", "luna", "mar", "estrella", "cielo"]

letra = input("Dime la inicial: ")

for i in palabras:
    if i.startswith(letra):
        print(i)