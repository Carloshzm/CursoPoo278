package com.mx.curso.proyectofinal.modelo;

public class MaterialDidactico {
    private String idMaterial;
    private String titulo;
    private String tipo;
    private String idDisciplina;

    public MaterialDidactico(String idMaterial, String titulo, String tipo, String idDisciplina) {
        this.idMaterial = idMaterial;
        this.titulo = titulo;
        this.tipo = tipo;
        this.idDisciplina = idDisciplina;
    }

    public String getIdMaterial() { return idMaterial; }
    public String getTitulo() { return titulo; }
}


