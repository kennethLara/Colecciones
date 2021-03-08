package com.desarrollo.colecciones;

import java.util.Scanner;

public class ClaseEjecutableNumeros {

    public static void main(String[] args) {

        double numero;
        char resp;
        int posicion;

        Scanner sc = new Scanner(System.in);
        Numeros num = new Numeros();

        do {
            System.out.println("Ingrese el número decimal para la lista: ");
            numero = sc.nextDouble();

            num.agregarDatos(numero);
        } while (numero != 0);

        //imprimir
        num.mostrarLista();

        System.out.println("");
        System.out.println("Desea ingresar otro número: ");
        resp = sc.next().charAt(0);
        if (resp == 's') {
            System.out.println("Ingresar posición: ");
            posicion = sc.nextInt();
            System.out.println("Ingresar el dato: ");
            numero = sc.nextDouble();
            num.agregarDatoPosicion(posicion, numero);
        } else {
            System.out.println("Fin del programa");
        }

        num.mostrarLista();

    }

}
