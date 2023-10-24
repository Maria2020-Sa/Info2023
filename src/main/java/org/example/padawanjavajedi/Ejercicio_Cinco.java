package org.example.padawanjavajedi;

public class Ejercicio_Cinco {
    public static void main(String[] args) {
        /*Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
        otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
        una constante de los valores que no van a cambiar en esta conversión. Muestre el
        resultado por pantalla*/

        int libras = 100;
        final float kilogramos= 2.2f;
        double conversion = libras * kilogramos;

        System.out.println(libras + "Libras, equivale a " + conversion + " kilogramos");
    }
}
