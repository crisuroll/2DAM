estudiantes = {
    "Cris":"P",
    "Santi":"A",
    "Enma":"P"
}

a = input("Dime un estudiante: ")

print(estudiantes.get(a, "No encontrado"))