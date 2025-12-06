package com.mx.curso.unidad3.conceptos_basicos.polimorfismo;

public class Cocinero extends Empleado{


    @Override
    public double calcularSalario() {
        return 2500 * 4;
    }
}
