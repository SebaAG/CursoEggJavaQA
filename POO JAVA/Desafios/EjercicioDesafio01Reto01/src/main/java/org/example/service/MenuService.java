package org.example.service;

import org.example.entidad.Vehiculo;
import java.util.Scanner;

public class MenuService {

    private static final Scanner tecla = new Scanner(System.in).useDelimiter("\n");
    private final VehiculoService vs = new VehiculoService();

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 4);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. Crear Automóvil
                2. Crear Motocicleta
                3. Crear Bicicleta
                4. Salir""");
    }

    private static int obtOpc() {
        System.out.println("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> crearVehiculo("automovil");
            case 2 -> crearVehiculo("motocicleta");
            case 3 -> crearVehiculo("bicicleta");
            case 4 -> System.out.println("Adiós!");
            default -> System.out.println("Opción inválida.");
        }
    }

    private void crearVehiculo(String tipo) {
        System.out.println("Ingrese la marca del vehículo:");
        String marca = tecla.next();
        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = tecla.next();
        System.out.println("Ingrese el año del vehículo:");
        int anno = tecla.nextInt();

        Vehiculo vehiculo = new Vehiculo(marca, modelo, anno, tipo);
        System.out.println("Vehículo creado exitosamente.");

        moverse(vehiculo, 5);
        moverse(vehiculo, 10);
        moverse(vehiculo, 60);

        frenar(vehiculo);

        int tiempo = 300;
        double distancia = calcularDistanciaRecorrida(vehiculo, tiempo);

        System.out.println("El vehículo ha recorrido " + distancia + " metros.");
    }

    private void moverse(Vehiculo vehiculo, int tiempo) {
        vs.moverse(vehiculo, tiempo);
    }

    private void frenar(Vehiculo vehiculo) {
        vs.frenar(vehiculo);
    }

    private double calcularDistanciaRecorrida(Vehiculo vehiculo, int tiempo) {
        return vs.calcularDistanciaRecorrida(vehiculo, tiempo);
    }
}