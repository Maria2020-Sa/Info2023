package org.example.ejercicios_nivel_niciado_JAVA_JEDI.ejercicio2;

import org.example.ejercicios_nivel_niciado_JAVA_JEDI.ejercicio1.Alumno;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    /*Crear una clase curso, el cual tenga atributos como:
    a. Nombre; b. Si está habilitado o no; c. Descripción; d. Alumnos.
    Cree uno o más cursos y asigne a la lista de alumnos, objetos del ejercicio 1.
    Luego imprima el nombre del curso, su descripción y luego los nombres de los alumnos de dicho curso.*/
    private String nombre;
    private boolean estaHabilitado;
    private String descripcion;
    private List<Alumno> alumnos;

    public Curso (){
        this.alumnos = new ArrayList<>();
    }

    public String getNombre (){
        return this.nombre;
    }
    public boolean isEstaHabilitado (){
        return this.estaHabilitado;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public List<Alumno> getAlumnos(){
        return this.alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstaHabilitado(boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void addAlumnos (Alumno alumno){
        alumnos.add(alumno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
