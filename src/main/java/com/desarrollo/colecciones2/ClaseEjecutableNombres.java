package com.desarrollo.colecciones2;

import java.util.Scanner;

public class ClaseEjecutableNombres {

    public static void main(String[] args) {

        int op;
        String nombre;

        Scanner sc = new Scanner(System.in);
        Nombres nombres = new Nombres();
        do {
            System.out.println("MENÚ");
            System.out.println("1. Agregar Nombre");
            System.out.println("2. Mostrar Lista");
            System.out.println("3. Invertir Lista");
            System.out.println("4. Mostrar Lista Invertida");
            System.out.println("5. Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese un nombre: ");
                    nombre = sc.next();
                    nombres.agregarNombres(nombre);
                    break;
                case 2:
                    nombres.mostrarLista();
                    break;
                case 3:
                    nombres.listaInvertida();
                    break;
                case 4:
                    nombres.mostrarListaInvertida();
                    break;
                case 5:
                    System.out.println("GRACIAS-SALIR");
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");

            }
        } while (op != 5);

    }

}
