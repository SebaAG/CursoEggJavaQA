package org.example.service;

import org.example.entidad.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuService {

    private static final Scanner tecla = new Scanner(System.in);
    private final Tienda tienda = new Tienda(new ArrayList<>());

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 6);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. AGREGAR PRODUCTO
                2. VENTA DE PRODUCTO
                3. REPOSICIÓN DE PRODUCTO
                4. ELIMINAR PRODUCTO
                5. MOSTRAR PRODUCTOS
                6. SALIR""");

        System.out.println();
    }

    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> agregarProducto(tienda);
            case 2 -> ventaProducto(tienda);
            case 3 -> reposicionProducto(tienda);
            case 4 -> eliminarProducto(tienda);
            case 5 -> mostrarProductos(tienda);
            case 6 -> System.out.println("Adios!");
            default -> System.out.println("Opción invalida.");
        }
    }

    private static void agregarProducto(Tienda tienda) {
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = tecla.next();
        System.out.println("Ingrese la categoría del producto: ");
        String categoria = tecla.next();
        System.out.println("Ingrese el precio del producto: ");
        double precio = tecla.nextDouble();
        System.out.println("Ingrese la cantidad en inventario del producto: ");
        int cantidadInventario = tecla.nextInt();

        Producto nuevoProducto = new Producto(nombre, categoria, precio, cantidadInventario);
        tienda.agregarProducto(nuevoProducto);
        System.out.println("Producto agregado exitosamente.");
    }

    private static void ventaProducto(Tienda tienda) {
        System.out.println("Ingrese el nombre del producto a vender: ");
        String nombre = tecla.next();

        if (tienda.venta(nombre)) {
            System.out.println("Venta realizada exitosamente.");
        }
    }

    private static void reposicionProducto(Tienda tienda) {
        System.out.println("Ingrese el nombre del producto a reponer: ");
        String nombre = tecla.next();
        tienda.reposicion(nombre);
    }

    private static void eliminarProducto(Tienda tienda) {
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String nombre = tecla.next();
        tienda.eliminarProducto(nombre);
    }

    private static void mostrarProductos(Tienda tienda) {
        tienda.mostrarProducto();
    }
}