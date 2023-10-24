package org.example.padawanjavajedi;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_Tres {
    public static void main(String[] args) {
        /*Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
        en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
        Porque se utiliza para indicar que un dato es del tipo String.
        ¿Qué es unicode? Unicode es un estándar de codificación de caracteres que proporciona una forma unificada
        y global de representar texto en una amplia variedad de idiomas y sistemas de escritura, lo que facilita
        la comunicación y el intercambio de datos. */
        char letraM = '\u004d';
        char letraA = '\u0061';
        char letraR = '\u0072';
        char letraI = '\u0069';
        char letraA2 = '\u0061';
        System.out.printf("%c%c%c%c%c\n",letraM,letraA,letraR,letraI,letraA2);
        System.out.println(letraM + "" + letraA + "" + letraR + "" + letraI + "" + letraA2);
        System.out.println(letraM + letraA + letraR + letraI + letraA2);

    }
}
