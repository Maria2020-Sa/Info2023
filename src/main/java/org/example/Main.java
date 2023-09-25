package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    /*Suma de dos números: Se le solicita que guarden dos números enteros y los sumen.
    El resultado mostrarlo por pantalla.*/

        int num1 = 2;
        int num2 = 3;
        System.out.println("La suma de num1 + num2 es = " + (num1 + num2));

    /*Suma de dos números bis: Se les solicita que guarden dos números enteros y los sumen.
    El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que indique si se trata de un número par o impar.
    El mensaje debe tener el siguiente formato: “El resultado es “ {Resultado} “y es” {paridad} */

        int a = 4;
        int b = 6;
        int c = a + b;

        if (c % 2 == 0){
            System.out.println("El resultado es " + c + " y es par");
        }
        else {
            System.out.println("El resultado es " + c + " y es impar");
        }

    /*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
    y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? Porque se usa para los tipo String. */

        // Crear una lista de caracteres usando ArrayList
        ArrayList<Character> maria = new ArrayList<>();
        // Agregar caracteres a la lista
        maria.add('m');
        maria.add('a');
        maria.add('r');
        maria.add('i');
        maria.add('a');
        // Iterar a través de la lista
        for (char caracteres : maria){
            System.out.println("caracteres = " + caracteres);// Esto imprimirá cada carácter en una línea
        }
        System.out.println("Maria E");

    }
}