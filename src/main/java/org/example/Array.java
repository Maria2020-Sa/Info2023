package org.example;

public class Array {
    public static void main(String[] args) {

        /*int[] numero = new int[] {1,2,3,4,5};
        //indica que elemento está en el indice 0.
        System.out.println (numero[0]);
        //La longitud del arrgeglo se puede saber a partir del atributo .Length del array.
        System.out.println(numero.length);*/


        int [][] arre = {{1,2},{3,4,5}};
        /*System.out.println (arre.length);
        System.out.println (arre[0].length);
        System.out.println (arre[1].length);
        System.out.println(arre[1][0]);*/

        /*  j=0 j=1
        i=0 [1] [2]
        i=1 [3] [4]
        */
        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre[i].length; j++) {
                System.out.println(arre[i][j]);
            }
        }


    }
}
