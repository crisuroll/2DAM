cad = str("Hola MUNDO")
voc = int(0)

for i in cad.lower():
    if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
        voc += 1

print(voc)