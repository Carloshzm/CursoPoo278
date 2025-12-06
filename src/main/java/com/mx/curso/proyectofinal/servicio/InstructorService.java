package com.mx.curso.proyectofinal.servicio;

import com.mx.curso.proyectofinal.modelo.Instructor;
import com.mx.curso.proyectofinal.modelo.Planeacion;

import java.util.ArrayList;

public class InstructorService {

    private ArrayList<Instructor> instructores = new ArrayList<>();
    private ArrayList<Planeacion> planeaciones = new ArrayList<>();

    public void registrarInstructor(Instructor i) {
        instructores.add(i);
    }

    public void agregarPlaneaciones(ArrayList<Planeacion> lista) {
        this.planeaciones = lista;
    }

    public ArrayList<Planeacion> obtenerPlaneacionesPorInstructor(String id) {
        ArrayList<Planeacion> resultado = new ArrayList<>();
        for (Planeacion p : planeaciones) {
            if (p.getIdDisciplina().equals(id)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}

