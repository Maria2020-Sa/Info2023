package org.example.javajedi;

public class Ejercico_Siete {
    public static void main(String[] args) {
         /*7. Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
        guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
        memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? 1052.04 ¿Entero o
        real? Real ¿Por qué? Porque predomina el que tiene mayor precisión */

        double numReal1 = 15.6d, numReal2 = 25.9d;
        numReal1 *= numReal2;
        int numEntero1 = 18, numEntero2 = 36;
        numEntero1 *= numEntero2;

        System.out.println(numReal1 + numEntero1);
    }
}
