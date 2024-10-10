lista = [1, 3, 5, 6]
lista.sort()
mediana = 0
mitad = len(lista)//2

if len(lista)%2 == 0:
    mediana = (lista[mitad] + lista[mitad-1]) / 2
else:
    mediana = lista[mitad]

print(mediana)