package com.desarrollo.colecciones;

import java.util.ArrayList;

public class Numeros {

    //Definimos Colección
    ArrayList<Double> lista = new ArrayList();

    //méto agregar datos
    public void agregarDatos(double numero) {
        if (numero != 0) {
            lista.add(numero);
        }
    }
    //método imprimir

    public void mostrarLista() {
        double acumValores = 0;
        double promedio;
        System.out.println("La lista es: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            acumValores = acumValores + lista.get(i);
        }

        promedio = acumValores / lista.size();
        System.out.println("La cantidad de números ingresados es: " + lista.size());
        System.out.println("El promedio es: " + promedio);
    }

    public void agregarDatoPosicion(int posicion, double numero) {
        if (numero != 0) {
            lista.add(posicion, numero);
        }
    }
}
