package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entidad.Producto;

import java.util.ArrayList;

@AllArgsConstructor
public class Tienda {

    private ArrayList<Producto> inventario;

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public boolean venta(String productoNombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(productoNombre)) {
                if (producto.getCantInventario() > 0) {
                    producto.setCantInventario(producto.getCantInventario() - 1);
                    return true;
                } else {
                    System.out.println("No hay inventario disponibles!");
                    return false;
                }
            }
        }
        System.out.println("***** PRODUCTO NO ENCONTRADO *****");
        return false;
    }

    public void reposicion(String nombreProducto) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                producto.setCantInventario(producto.getCantInventario() + 1);
                System.out.println("Reposición realizada.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void mostrarProducto() {
        for (Producto producto : inventario) {
            System.out.println(producto.toString());
        }
    }

    public void eliminarProducto(String productoNombre) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getNombre().equalsIgnoreCase(productoNombre)) {
                inventario.remove(i);
                System.out.println("***** PRODUCTO ELIMINADO *****");
                return;
            }
        }
        System.out.println("***** PRODUCTO NO ENCONTRADO *****");
    }
}
