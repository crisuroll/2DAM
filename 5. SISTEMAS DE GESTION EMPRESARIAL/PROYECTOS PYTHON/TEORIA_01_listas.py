# mi_lista = [1, 2, "Hola", True] #crea una lista
# mi_lista.append(3) # agrega un elemento al final
# mi_lista.remove(2) # elimina un elemento; si hay repetidos los elimina también
# len(mi_lista) # devuelve la cantidad de elementos
# mi_lista.pop() # elimina y devuelve el último elemento (o uno particular si se indica su índice)

# mi_lista.extend([3, 4]) # añade una lista a otra
# mi_lista.insert(1, "pepe") # inserta un valor en un índice
# mi_lista.index(1) # devuelve el índice de la primera aparición del valor dado

# mi_lista.count(2) # cuenta cuántas veces aparece un valor
# # mi_lista.sort() # ordena de menor a mayor los elementos de la lista, SIEMPRE QUE SEAN DEL MISMO TIPO
# # mi_lista.reverse() # igual pero de mayor a menor
# mi_lista.clear() # vacía la lista
# mi_lista = [1, 2]
# nueva_lista = mi_lista.copy() # copia una lista en otra, también se puede hacer nueva_lista = mi_lista

# print(mi_lista)

# # SUBLISTAS
# mi_lista = [1, 0, 2, 6, 3, 2]
# # nueva_lista = [1:3] # devuelve una lista con los elementos del índice 1 al 3
# # nueva_lista = [1:6:2] # devuelve una lista con los elementos del índice 1 al 6 con saltos en 2

# mi_lista = ["Hola mundo", 3, 4, "pepe"]
# mi_lista[1:3] = ["hola", "pepe2"]
# print(mi_lista)

# lista1 = [1, 2, 3]
# lista2 = [1, 2, 3]
# lista3 = [1, 2, 4]

# print(lista1<lista3)

# lista = [5, 9, 10]
# for index, i in enumerate(lista):
#     print(index,i)

# frutas = ["manzana", "banana", "cereza"]
# for indice, frutas in enumerate(frutas):
#     print(indice, frutas)

# lista1 = [5, 9, 10]
# lista2 = ["Jazz", "Rock", "Djent"]
# for i1, i2 in zip(lista1, lista2):
#     print(i1, i2)

# mi_lista = [10, "Python", False, [4, 5, 6]]
# print(mi_lista[0] + 5) # Operación con un entero -> 15
# print(mi_lista[1].upper()) # Convertir la cadena a mayúsculas -> 'PYTHON'
# print(mi_lista[2] or True) # Operación lógica -> True
# if "Python" in mi_lista:
#     print("La palabra 'Python' está en la lista.") # Resultado: True
# mi_lista[3][0] = 100 # Cambiamos el primer elemento de la lista anidada por 100.
# print(mi_lista)
# # print(mi_lista[3][1]) # Acceder al segundo elemento de la lista anidada -> 5

# SENTENCIA MATCH: es como un switch
# match:
#     case 1:
#     case _: # default

# # f-strings
# nombre = "Cris"
# edad = 20
# print(f"Hola {nombre} tienes {edad} años")

# # tuplas
# tupla_vacia = ()

# tupla = (3, 4, 5)

# if len(tupla) == 1:
#     print(f"Un número: {tupla[0]}")
# elif len(tupla) == 2:
#     print(f"La suma de {tupla[0]} y {tupla[1]} es: ", tupla[0] + tupla[1])
# elif len(tupla) == 3:
#     print(f"El producto de {tupla[0]}, {tupla[1]} y {tupla[2]} es: ", tupla[0] * tupla[1] * tupla[2])
# else:
#     print("Excede el tamaño.")

# conjuntos: colección no ordenada y sin elementos repetidos.

# diccionarios: parejas clave-valor. hashmap
dic = {
    "Nombre":"Sierra",
    "Edad":25
}

dic2 = ([
    ("Nombre", "Sierra"),
    ("Edad", 25)
])

dic["Nombre"] = "Santi"
dic["Curso"] = "2ºDAM"
print(dic)

for i in dic: #imprime las key
    print(i)
for i in dic: #imprime los value
    print(dic[i])

for i, j in dic.items():
    print(i, j)

# anidar diccionarios
a = {"a":1, "b":2}
b = {"a":1, "b":2}
# clear() elimina el diccionario entero
# get() consulta el value de una key. el segundo parametro es opcional y es lo que devuelve si no se encuentra la key
print(dic.get("Cris", "No encontrado"))
# items() devuelve una lista con los keys y values del diccionario
print(dic.items())
# keys() devuelve una lista con todas las claves del diccionario
# values() devuelve una lista con todos los values del diccionario
# pop() busca una key y la elimina. el segundo parametro es opcional y es lo que devuelve si no se encuentra la key
# popitem() elimina el ultimo elemento del diccionario
# update(<obj>) tiene como entrada otro diccionario. actualiza los values, y si alguna key no está la añade.
d1 = {"a":1, "b":2}
d2 = {"a":0, "d":400}
d1.update(d2)
print(d1)
# list(diccionario) devuelve una lista con todas las claves usadas en el orden de inserción. para ordenar se usa sorted(diccionario)
# in se usa para ver si una clave esta en el diccionario