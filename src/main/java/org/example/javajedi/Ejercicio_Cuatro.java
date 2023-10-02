package org.example.javajedi;

public class Ejercicio_Cuatro {
    public static void main(String[] args) {
        /*4. Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
        sumen, determine si el primer número es divisible por el segundo número y muestre
        el resultado.*/

        int num1 = 14, num2 = 2;
        System.out.println("num1 + num2 = " + (num1 + num2) + ((num1%num2 == 0)? ", el primero es divisible por el segundo" : ", el primero no es divisible por el segundo"));
    }
}
