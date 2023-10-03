package org.example.javajedi;

public class Ejercicio_Diez {
    public static void main(String[] args) {
        /*10. Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
        de quince multiplicaciones entre dos números enteros divididos por el número de la
        multiplicación. Por ejemplo:
        Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
        El resultado mostrarlo por pantalla.*/

        int acumulador = (4 * 3) / 1 + (4 * 3) / 2 + (4 * 3) / 3 + (4 * 3) / 4 + (4 * 3) / 5 + (4 * 3) / 6 + (4 * 3) / 7 + (4 * 3) / 8 + (4 * 3) / 9 + (4 * 3) / 10 + (4 * 3) / 11 + (4 * 3) / 12 + +(4 * 3) / 13 + (4 * 3) / 14 + (4 * 3) / 15;
        System.out.println("acumulador = " + acumulador);
    }
}
