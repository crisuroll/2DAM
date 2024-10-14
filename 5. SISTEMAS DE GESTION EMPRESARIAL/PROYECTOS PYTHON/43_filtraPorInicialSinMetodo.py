palabras = ["sol", "luna", "mar", "estrella", "cielo"]

letra = input("Dime la inicial: ")

for i in palabras:
    if i[0] == letra:
        print(i)