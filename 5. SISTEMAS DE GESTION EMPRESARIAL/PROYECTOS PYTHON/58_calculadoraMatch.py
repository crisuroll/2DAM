num1 = int(input("Dime el primer número: "))
num2 = int(input("Dime el segundo número: "))
op = input("Dime una operación (+, -, *, /): ")

match op:
    case '+':
        print('La suma de ', num1, ' y ', num2, ' es: ', num1+num2)
    case '-':
        print('La resta de ', num1, ' y ', num2, ' es: ', num1-num2)
    case '*':
        print('El producto de ', num1, ' y ', num2, ' es: ', num1*num2)
    case '/':
        if num2 == 0:
            print('No puedes dividir entre cero.')
        else:
            print('La división de ', num1, ' y ', num2, ' es: ', num1/num2)
    case _:
        print('Operación inválida.')