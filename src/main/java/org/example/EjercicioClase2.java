package org.example;

public class EjercicioClase2 {
    public static void main(String[] args) {
   /*Dado un array en 2D calcula la suma de los elementos en diagonal
    myArray2D= {
                {1,2,3},
                {4,5,6},
                {7,8,9}  }; */

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int num1 = arr[0][0];
        int num2 = arr[1][1];
        int num3 = arr[2][2];
        int suma = (num1 + num2 + num3);
        System.out.println("La suma de los elementos de la diagonal es: " + suma);
        
        int sumaFor = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i==j){
                    sumaFor += arr[i][j];
                }
            }
        }
        System.out.println("sumaFor = " + sumaFor);

        int j = arr.length -1; //2
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i][j]);
            j--;
        }
    }
}
