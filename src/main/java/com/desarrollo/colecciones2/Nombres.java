package com.desarrollo.colecciones2;

import java.util.LinkedList;

public class Nombres {

    LinkedList<String> lista = new LinkedList();
    LinkedList<String> listaInvertida = new LinkedList();

    public void agregarNombres(String nombre) {
        lista.add(nombre);

    }

    public void mostrarLista() {
        System.out.println("Lista Ingresada");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public void listaInvertida() {
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));
        }
        System.out.println("LISTA INVERTIDA");
    }

    public void mostrarListaInvertida() {
        System.out.println("Lista Ingresada");
        for (int i = 0; i < listaInvertida.size(); i++) {
            System.out.println(listaInvertida.get(i));
        }
    }
}
