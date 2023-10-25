package org.example.ejercicios_nivel_niciado_JAVA_JEDI.ejercicio1;

import com.sun.org.apache.xml.internal.serializer.ToStream;

import java.time.LocalDate;

public class Alumno {
    /*Crear una clase alumno, el cual tenga atributos como: a. Nombre; b. Apellido; c. Fecha de nacimiento; d. Edad
    Luego cree 3 objetos de la clase e imprima por pantalla el nombre, apellido y edad de cada uno*/
        private String nombre;
        private String apellido;
        private LocalDate fechaDeNacimiento;
        private int edad;

        public String getNombre (){
            return this.nombre;
        }
        public String getApellido(){
            return this.apellido;
        }
        public LocalDate getFechaDeNacimiento(){
            return this.fechaDeNacimiento;
        }
        public int getEdad (){
            return this.edad;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }
        public void setApellido (String apellido){
            this.apellido = apellido;
        }
        public void setFechaDeNacimiento (LocalDate fechaDeNacimiento){
            this.fechaDeNacimiento = fechaDeNacimiento;
        }
        public void setEdad (int edad){
            this.edad = edad;
        }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
