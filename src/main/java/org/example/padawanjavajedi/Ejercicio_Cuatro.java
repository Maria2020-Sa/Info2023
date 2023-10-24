package org.example.padawanjavajedi;

public class Ejercicio_Cuatro {
    public static void main(String[] args) {
        /*Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
    edad y los nombres de esas personas, luego saque su promedio e imprima por
    pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
    edades.*/

        int edad1 = 32;
        int edad2 = 33;
        int edad3 = 2;
        String nombre1 = "Maria";
        String nombre2 = "Fran";
        String nombre3 = "Baty";
        int promedio = ((edad1 + edad2 + edad3) / 3);

        System.out.println("Nombre: " + nombre1 + ", edad: " + edad1);
        System.out.println("Nombre: " + nombre2 + ", edad: " + edad2);
        System.out.println("Nombre: " + nombre3 + ", edad: " + edad3);
        System.out.println("promedio de sus edades = " + promedio);
    }
}
