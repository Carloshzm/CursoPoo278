package com.mx.curso.proyectofinal.modelo;

public class MaterialDidactico {
    private String idMaterial;
    private String titulo;
    private String tipo;
    private String idDisciplina;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIdMaterial(String idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public MaterialDidactico(String idMaterial, String titulo, String tipo, String idDisciplina) {
        this.idMaterial = idMaterial;
        this.titulo = titulo;
        this.tipo = tipo;
        this.idDisciplina = idDisciplina;
    }

    public String getIdMaterial() { return idMaterial; }
    public String getTitulo() { return titulo; }
}


