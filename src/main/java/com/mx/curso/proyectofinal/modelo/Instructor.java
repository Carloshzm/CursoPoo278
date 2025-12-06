package com.mx.curso.proyectofinal.modelo;

public class Instructor {
    private String id;
    private String nombre;
    private String contacto;
    private String disciplina;

    public Instructor(String id, String nombre, String contacto, String disciplina) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.disciplina = disciplina;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDisciplina() { return disciplina; }
}


