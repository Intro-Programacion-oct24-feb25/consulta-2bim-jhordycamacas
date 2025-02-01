def principal():
 numero = int(input("Ingrese el numero a calcular"))
 resultado = encontrar_factorial(numero)
 print("El resultado es: \n" + str(resultado))



def encontrar_factorial(a):
    if a == 1:
        return 1
    else:
        factorial = a * encontrar_factorial(a - 1)
    
    return factorial