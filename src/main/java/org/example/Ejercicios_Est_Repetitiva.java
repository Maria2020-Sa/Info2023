package org.example;

public class Ejercicios_Est_Repetitiva {
    public static void main(String[] args) {
        int numero = 6;
        //...-1,1,2
        if (numero <= 2){
            if (numero == 2){
                System.out.println(numero + " es un número primo");
            }else {
                System.out.println(numero + "es un número no primo");
            }
        }else{
            for (int divisor = 2;divisor < numero; divisor++){
                if (numero % divisor == 0){
                    System.out.println(numero + " es un nùmero no primo");
                    break;
                }else if (divisor == numero -1){
                    System.out.println(numero + " es un nùmero primo");
                }
            }
        }
    }
}

