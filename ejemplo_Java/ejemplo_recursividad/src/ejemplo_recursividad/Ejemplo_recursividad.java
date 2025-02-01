/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_recursividad;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejemplo_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        int resultado = sumaRecursividad(numero);
        System.out.printf("Resultado:\n%d\n", resultado);

    }

    public static int sumaRecursividad(int a) {
        int suma;

        if (a == 1) {
            return 1;

        } else {
            suma = a + sumaRecursividad(a - 1);
        }

        return suma;

    }
    //Este programa permite sumar todos los numero naturales hasta n numero, 
    // que es ingresado por teclado, es decir si se ingresa el 5, se sumaran
    //1+2+3+4+5, de forma recursiva

}
