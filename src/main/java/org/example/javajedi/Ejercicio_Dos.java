package org.example.javajedi;

public class Ejercicio_Dos {
    public static void main(String[] args) {
        /*Suma de dos números bis: Se les solicita que guarden dos números enteros y los sumen.
    El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que indique si se trata de un número par o impar.
    El mensaje debe tener el siguiente formato: “El resultado es “ {Resultado} “y es” {paridad} */

        int a = 3;
        int b = 6;
        int c = a + b;
        System.out.println("El resultado es " + c + " y es " + ((c % 2 == 0)? "par":"impar"));

    }
}
