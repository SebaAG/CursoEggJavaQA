package org.example.service;

import lombok.AllArgsConstructor;
import org.example.entidad.Producto;

import java.util.ArrayList;

@AllArgsConstructor
public class Tienda {

    private ArrayList<Producto> inventario;

    public void agregarProducto(Producto producto) {
        if (producto == null) {
            System.out.println("**ERROR**");
            return;
        }
        inventario.add(producto);
    }

    public boolean venta(String productoNombre) {
        if (productoNombre == null || productoNombre.trim().isEmpty()) {
            System.out.println("**ERROR** - NOMBRE INVÁLIDO");
            return false;
        }
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(productoNombre)) {
                if (producto.getCantInventario() > 0) {
                    producto.setCantInventario(producto.getCantInventario() - 1);
                    return true;
                } else {
                    System.out.println("**NO HAY INVENTARIO DISPONIBLE**");
                    return false;
                }
            }
        }
        System.out.println("***** PRODUCTO NO ENCONTRADO *****");
        return false;
    }

    public void reposicion(String nombreProducto) {
        if (nombreProducto == null || nombreProducto.trim().isEmpty()) {
            System.out.println("**ERROR** - NOMBRE INVÁLIDO");
            return;
        }
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                producto.setCantInventario(producto.getCantInventario() + 1);
                System.out.println("**REPOSICIÓN REALIZADA");
                return;
            }
        }
        System.out.println("**PRODUCTO NO ENCONTRADO**");
    }

    public void mostrarProducto() {
        if (inventario.isEmpty()) {
            System.out.println("**EL INVENTARIO ESTA VACÍO**");
            return;
        }
        for (Producto producto : inventario) {
            System.out.println(producto.toString());
        }
    }

    public void eliminarProducto(String productoNombre) {
        if (productoNombre == null || productoNombre.trim().isEmpty()) {
            System.out.println("**ERROR** - NOMBRE INVÁLIDO");
            return;
        }
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
