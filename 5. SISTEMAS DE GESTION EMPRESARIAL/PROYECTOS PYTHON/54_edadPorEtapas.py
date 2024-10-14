edad = int(input("Dime tu edad: "))

match edad:
    case _ if 0 <= edad <= 12:
        print("Niño")
    case _ if 13 <= edad <= 17:
        print("Adolescente")
    case _ if 18 <= edad <= 64:
        print("Adulto")
    case _ if edad > 64:
        print("Anciano")