package com.mx.curso.unidad2.secuencia.excepciones;

public class ConversorObjetos {

    static void main(String[] args) {

        Object objeto = "UX";

        try{
            Integer numero = (Integer) objeto;
        }catch (ClassCastException e){
            System.out.println("No es posible convertir un tipo " +
                    "de objeto al tipo deseado: " + e.getMessage());
        }
    }
}
