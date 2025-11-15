package com.mx.curso.unidad2.secuencia.modelado;

import java.math.BigDecimal;
import java.util.function.DoubleToIntFunction;

public class MainModelado {
    static void main(String[] args) {
        House house = new House();
        house.setColor("Blue");
        house.setSize("Big");
        System.out.println("Nombre:" + house.getColor());
        System.out.println("Size:" + house.getSize());

    }
}
