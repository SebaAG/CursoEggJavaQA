package org.example.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {

    private final Map<String, Double> productos = new HashMap<>();
    private final Scanner tecla = new Scanner(System.in);

    public void agregarProducto() {
        System.out.println("Ingresar el nombre del producto: ");
        String nombre = tecla.next().toUpperCase();
        System.out.println("Ingresar el precio del producto: ");
        double precio = tecla.nextDouble();
        productos.put(nombre, precio);
        System.out.println("Producto agregado de forma correcta!");
    }

    public void modifPrecio() {
        System.out.println("Ingresar nombre del producto a modificar: ");
        String nombre = tecla.next().toUpperCase();
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio del producto: ");
            double newPrecio = tecla.nextDouble();
            tecla.nextLine();

            productos.put(nombre, newPrecio);
            System.out.println("Precio del producto ha sido modificado correctamente!");
        } else {
            System.out.println("El producto no se encuentra en la tienda!");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingresar nombre del producto a eliminar: ");
        String nombre = tecla.next().toUpperCase();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente!");
        } else {
            System.out.println("El producto no se encuentra en la tienda!");
        }
    }

    public void mostrarProductos() {
        System.out.println("***** PRODUCTOS EN LA TIENDA *****");
        System.out.println();
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + '\n' +
                    "Precio: " + entry.getValue());
            System.out.println();
        }
        System.out.println("----------------------------");
    }
}
