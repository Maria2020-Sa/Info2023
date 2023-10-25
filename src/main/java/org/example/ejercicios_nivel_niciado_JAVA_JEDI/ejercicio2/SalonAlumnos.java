package org.example.ejercicios_nivel_niciado_JAVA_JEDI.ejercicio2;
import org.example.ejercicios_nivel_niciado_JAVA_JEDI.ejercicio1.Alumno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SalonAlumnos {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNombre("Salon Uno");
        curso.setEstaHabilitado(true);
        curso.setDescripcion("Musica");

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Maria");
        alumno1.setApellido("Saracho");
        alumno1.setFechaDeNacimiento(LocalDate.of(1991, 02, 10));
        alumno1.setEdad(32);
        curso.addAlumnos(alumno1);

        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Fran");
        alumno2.setApellido("Romero");
        alumno2.setFechaDeNacimiento(LocalDate.of(1990, 02, 13));
        alumno1.setEdad(33);
        curso.addAlumnos(alumno2);

        Alumno alumno3 = new Alumno();
        alumno3.setNombre("Baty");
        alumno3.setApellido("Batman");
        alumno3.setFechaDeNacimiento(LocalDate.of(2021, 06, 02));
        alumno3.setEdad(2);
        curso.addAlumnos(alumno3);

        System.out.println(curso);
    }
}
