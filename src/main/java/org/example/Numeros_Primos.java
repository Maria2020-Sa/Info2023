package org.example;

import java.util.Scanner;

public class Numeros_Primos {
        public static void main(String[] args) {

            int num, cont;
            cont = 0;
            num = 10;

            for (int i =1; i <= num; i++){
                boolean esDivisible = false;
                if (i == 2){
                    System.out.println(i + " es primo");
                    cont++;
                }


                for (int j = i-1; j > 1; j--){
                    if (i%j == 0){
                        esDivisible = true;
                    }
                    if (esDivisible){
                        System.out.println(i + " no es primo.");
                        esDivisible = false;
                        break;
                    } else if (j == 2){
                        System.out.println(i + " es primo.");
                        cont ++;
                    }
                }
            }
            System.out.println("Hay "+ cont + " numero primos del 1 al " + num);
        }
}

