package org.example;

public class EjercicioClase {
    public static void main(String[] args) {

    /*Dado un array, escribe un programa que tome el primer y el segundo mejor valor y lo devuelva en un nuevo arreglo.
    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
    firstSecond(myArray) // {90, 87} */

        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int primero, segundo;
        primero = Integer.MIN_VALUE;
        segundo = Integer.MIN_VALUE;

        if (myArray == null || myArray.length <= 1) {
            System.out.println("El arreglo es nulo o menor/igual a 1. ");
        }else {
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] > primero) {
                    primero = myArray[i];
                }
            }
            for (int i = 0; i < myArray.length; i++){
                if (myArray[i] > segundo && myArray[i] < primero){
                    segundo = myArray[i];
                }
            }
        }
        System.out.println("El nuevo arreglo es: { " + primero + ",\t" + segundo + "}");
    }
}
