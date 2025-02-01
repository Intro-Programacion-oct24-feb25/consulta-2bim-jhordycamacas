def principal():
 numero = int(input("Ingrese el numero a calcular:  "))
 resultado = encontrar_factorial(numero)
 print("El resultado es: \n" + str(resultado))



def encontrar_factorial(a):
    if a == 1:
        return 1
    else:
        factorial = a * encontrar_factorial(a - 1)
    
    return factorial

principal() # Se tiene q llamar al main, si no no se ejecuta el programa

# Este programa permite encontrar el factorial de un numero ingresado por teclado, usando la recursividad


