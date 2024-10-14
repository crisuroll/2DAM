temp = int(input("Dime la temperatura: "))

match temp:
    case _ if temp < 0:
        print("Muy frío.")
    case _ if 0 <= temp <= 10:
        print("Frío.")
    case _ if 11 <= temp <= 20:
        print("Templado.")
    case _ if 21 <= temp <= 30:
        print("Caliente.")
    case _ if temp > 30:
        print("Muy caliente.")