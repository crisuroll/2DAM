productos = {
    "Leche":1.00,
    "Azúcar":1.50,
    "Harina":2.00,
    "Huevos":8.75
}

nom = input("Dime un producto: ")

print(productos.get(nom, "No existe ese producto"))