dia = input("Dime un día de la semana: ")

match dia.lower():
    case 'lunes' | 'martes' | 'miercoles' | 'jueves' | 'viernes':
        print("Laborable")
    case 'sabado' | 'domingo':
        print("No laborable")
    case _:
        "Entrada inválida."