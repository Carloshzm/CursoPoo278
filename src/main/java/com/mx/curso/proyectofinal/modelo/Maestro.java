package com.mx.curso.proyectofinal.modelo;

public class Maestro {
    private String idMaestro;
    private String nombre;
    private String telefono;
    private String correo;
    private String disciplina;
    private String grado;
    private String escuela;

    public String getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(String idMaestro) {
        this.idMaestro = idMaestro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

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


