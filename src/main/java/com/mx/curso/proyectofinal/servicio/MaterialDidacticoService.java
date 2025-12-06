package com.mx.curso.proyectofinal.servicio;

import com.mx.curso.proyectofinal.modelo.MaterialDidactico;

import java.util.ArrayList;

public class MaterialDidacticoService {

    private ArrayList<MaterialDidactico> materiales = new ArrayList<>();

    public void registrarMaterial(MaterialDidactico m) {
        materiales.add(m);
    }

    public MaterialDidactico buscarPorID(String id) {
        for (MaterialDidactico m : materiales) {
            if (m.getIdMaterial().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public MaterialDidactico buscarPorNombre(String nombre) {
        for (MaterialDidactico m : materiales) {
            if (m.getTitulo().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }
}

