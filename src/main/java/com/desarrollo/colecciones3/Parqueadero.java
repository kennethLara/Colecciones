package com.desarrollo.colecciones3;

import java.util.HashMap;
import java.util.Map;

public class Parqueadero {

    HashMap<Integer, String> parqueadero = new HashMap();

    public void generarEspacios() {
        for (int i = 1; i <= 10; i++) {
            parqueadero.put(i, "");
        }
    }

    public void agregarVehiculo(int espacio, String placa) {
        boolean bandera = false;
        if (parqueadero.containsKey(espacio)) {
            if (!parqueadero.containsValue(placa)) {
                for (Map.Entry<Integer, String> disponible : parqueadero.entrySet()) {
                    if (disponible.getKey() == espacio && disponible.getValue().equals("")) { //3
                        bandera = true;
                    }
                }

                //agregar en espacio disponible
                if (bandera == true) {
                    parqueadero.put(espacio, placa);
                    System.out.println("VEHÍCULO INGRESADO CORRECTAMENTE");
                } else {
                    System.out.println("ESPACIO OCUPADO");
                }

            } else {
                System.out.println("YA EXISTE ESA PLACA");
            }

        } else {
            System.out.println("Ese espacio no existe (1-10)");
        }
    }

    //método retirar
    public void retirarVehiculo(String placa) {
        if (parqueadero.containsValue(placa)) {
            for (Map.Entry<Integer, String> retirar : parqueadero.entrySet()) {
                if (retirar.getValue().equals(placa)) {
                    parqueadero.put(retirar.getKey(), "");
                    System.out.println("VEHÍCULO RETIRADO");
                }
            }

        } else {
            System.out.println("EL VEHÍCULO NO SE ENCUENTRA EN EL PARQUEADERO");
        }

    }

    public void mostrarEspacios() {
        System.out.println("PARQUEADERO ITSQMET");
        System.out.println("ESPACIO" + "\t\t" + "VEHÍCULO");
        for (Map.Entry<Integer, String> espacio : parqueadero.entrySet()) {
            System.out.println("  " + espacio.getKey() + "\t\t" + espacio.getValue());

        }
    }

}
