package org.example;

public class PruebaStatic {
    public static void main(String[] args) {
        Ejemplo num1 = new Ejemplo();
        num1.setNombre("Maria");
        Ejemplo num2 = new Ejemplo();
        num2.setNombre("Fran");

        System.out.println("num1 = " + num1.i);
        System.out.println("num1 = " + num1.getNombre());
        System.out.println("num2 = " + num2.i);
        System.out.println("num2 = " + num2.getNombre());

        Ejemplo.i++;
        System.out.println("num1 = " + num1.i);
        System.out.println("num2 = " + num2.i);
    }
}
class Ejemplo {
    static int i = 47;
    private String nombre;

    public String getNombre (){
        return this.nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
}
