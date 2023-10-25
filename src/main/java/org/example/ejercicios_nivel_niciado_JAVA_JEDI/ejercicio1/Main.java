package org.example.ejercicios_nivel_niciado_JAVA_JEDI.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Maria");
        alumno.setApellido("Saracho");
        alumno.setEdad(32);
        
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Francisco");
        alumno1.setApellido("Romero");
        alumno1.setEdad(33);
        
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Baty");
        alumno2.setApellido("Batman");
        alumno2.setEdad(2);

        System.out.println("alumno = " + alumno);
        System.out.println("alumno1 = " + alumno1);
        System.out.println("alumno2 = " + alumno2);
    }
}
