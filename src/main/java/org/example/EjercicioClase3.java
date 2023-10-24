package org.example;

import java.util.Arrays;

public class EjercicioClase3 {
    public static void main(String[] args) {
    /*Escribe un programa que tome un arreglo de enteros y cree un arreglo con elementos únicos.
    removeDuplicates({1, 1, 2, 2, 3, 4, 5})
    Output : [1, 2, 3, 4, 5]*/
        int[] arreDuplicates = {1, 1, 2, 3, 2, 4, 5};
        int indice = 0;

        for (int i = 0; i < arreDuplicates.length; i++){
            for (int j = i+1; j < arreDuplicates.length; j++){
                if (arreDuplicates[i] == arreDuplicates[j]){
                    indice++;
                    arreDuplicates[i]=0;
                }
            }
        }

        int[] arreOuput = new int[arreDuplicates.length - indice];
        int contador = 0;
        for (int i = 0; i < arreDuplicates.length; i++){
            if (arreDuplicates[i]!= 0){
                arreOuput[contador] = arreDuplicates[i];
                contador++;
            }
        }
        System.out.println(Arrays.toString(arreOuput));

    }
}
