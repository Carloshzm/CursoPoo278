package com.mx.curso.proyectofinal.servicio;

import com.mx.curso.proyectofinal.modelo.Planeacion;

import java.util.ArrayList;

public class PlaneacionService {

    private ArrayList<Planeacion> planeaciones = new ArrayList<>();

    public void registrarPlaneacion(Planeacion p) {
        planeaciones.add(p);
    }

    public void actualizarFecha(String idDisciplina, String nuevaFecha) {
        for (Planeacion p : planeaciones) {
            if (p.getIdDisciplina().equals(idDisciplina)) {
                p.setFecha(nuevaFecha);
            }
        }
    }

    public Planeacion buscarPorDisciplina(String idDisciplina) {
        for (Planeacion p : planeaciones) {
            if (p.getIdDisciplina().equals(idDisciplina)) {
                return p;
            }
        }
        return null;
    }

    public Planeacion buscarPorFecha(String fecha) {
        for (Planeacion p : planeaciones) {
            if (p.getFecha().equals(fecha)) {
                return p;
            }
        }
        return null;
    }
}
