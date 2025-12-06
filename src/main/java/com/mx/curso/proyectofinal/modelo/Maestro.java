package com.mx.curso.proyectofinal.modelo;

public class Maestro {
    private String idMaestro;
    private String nombre;
    private String telefono;
    private String correo;
    private String disciplina;
    private String grado;
    private String escuela;

    public Maestro(String idMaestro, String nombre, String telefono, String correo,
                   String disciplina, String grado, String escuela) {
        this.idMaestro = idMaestro;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.disciplina = disciplina;
        this.grado = grado;
        this.escuela = escuela;
    }
}


