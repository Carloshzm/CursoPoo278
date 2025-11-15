package com.mx.curso.unidad2.secuencia.ciclos;

public class ProcesadorDeListas {

    static void main(String[] args) {

        String [] frutas = {"Manzana", "Banana", "Cereza", "Durazno", "Uva"};

        for (int i=0; i<frutas.length; i++){
            System.out.println("Nombre de la fruta:" + frutas[i]);
        }

        System.out.println(frutas[4]);

        //Buscar un elemento especifico, utilizando while

        int indice=0;

        while (indice<frutas.length){
            if (frutas[indice].equals("Uva")){
                System.out.println("Fruta encontrada:" + frutas[indice]);
                break;
            }
            indice++;
        }
    }
}
