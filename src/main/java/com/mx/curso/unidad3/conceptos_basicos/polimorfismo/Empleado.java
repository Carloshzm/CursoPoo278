package com.mx.curso.unidad3.conceptos_basicos.polimorfismo;

public abstract class Empleado {

    public void trabajar(){
        System.out.println("El empleado está trabajando");
    }

    public abstract double calcularSalario();
}
