fib = int(input("¿Cuántos números quieres mostrar?: "))

a, b = 0, 1
for i in range(fib):
    print(a, end=' ')
    a, b = b, a + b