package com.desarrollo.colecciones3;

import java.util.Scanner;

public class ClaseEjecutableParqueadero {

    public static void main(String[] args) {

        int op;
        int espacio;
        String placa;

        Scanner sc = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();

        do {
            System.out.println("MENÚ PARQUEADERO ITSQMET");
            System.out.println("1. Generar Espacios");
            System.out.println("2. Agregar Vehículo");
            System.out.println("3. Espacios Disponibles");
            System.out.println("4. Retirar Vehículo");
            System.out.println("5. Salir");
            System.out.println("Escoja la opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    parqueadero.generarEspacios();
                    break;
                case 2:
                    System.out.println("Escoja un espacio: ");
                    espacio = sc.nextInt();
                    System.out.println("Ingrese la placa del vehículo: ");
                    placa = sc.next();
                    parqueadero.agregarVehiculo(espacio, placa);
                    break;
                case 3:
                    parqueadero.mostrarEspacios();
                    break;
                case 4:
                    System.out.println("RETIRAR VEHÍCULO");
                    System.out.println("Placa: ");
                    placa = sc.next();
                    parqueadero.retirarVehiculo(placa);
                    break;
                case 5:
                    System.out.println("GRACIAS -SALIR");
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
            }
        } while (op != 5);

    }

}
