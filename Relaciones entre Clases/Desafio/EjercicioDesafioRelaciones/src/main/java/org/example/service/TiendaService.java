package org.example.service;

import org.example.entity.Producto;
import org.example.entity.Tienda;

import java.util.ArrayList;
import java.util.List;

public class TiendaService {

    private final List<Producto> productos = new ArrayList<>();
    private final List<Tienda> tiendas = new ArrayList<>();

    public void crearProducto(int id, String nombre, double precio) {
        Producto producto = new Producto();
        producto.setId(id);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }

    public void modificarProducto(int id, String nuevoNombre, double nuevoPrecio) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setNombre(nuevoNombre);
                producto.setPrecio(nuevoPrecio);
                break;
            }
        }
    }

    public void eliminarProducto(int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void crearTienda(int idTienda, String direccion, String representante) {
        Tienda tienda = new Tienda();
        tienda.setIdTienda(idTienda);
        tienda.setDireccion(direccion);
        tienda.setRepresentante(representante);
        tiendas.add(tienda);
    }

    public void mostrarTiendas() {
        for (Tienda tienda : tiendas) {
            System.out.println("ID Tienda: " + tienda.getIdTienda() + ", Dirección: "
                    + tienda.getDireccion() + ", Representante: " + tienda.getRepresentante());
        }
    }

    public void modificarTienda(int idTienda, String nuevaDireccion, String nuevoRepresentante) {
        for (Tienda tienda : tiendas) {
            if (tienda.getIdTienda() == idTienda) {
                tienda.setDireccion(nuevaDireccion);
                tienda.setRepresentante(nuevoRepresentante);
                break;
            }
        }
    }

    public void eliminarTienda(int idTienda) {
        tiendas.removeIf(tienda -> tienda.getIdTienda() == idTienda);
    }

    public void agregarProductos(int idTienda, Producto producto, int cantidad) {
        for (Tienda tienda : tiendas) {
            if (tienda.getIdTienda() == idTienda) {
                // Agregar el producto con la cantidad al stock en la tienda
                producto.setStock(cantidad);
                tienda.getProductos().add(producto);
                break;
            }
        }
    }

    public void venderProductos(int idTienda, Producto producto, int cantidad) {
        Tienda tienda = encontrarTiendaPorId(idTienda);
        if (tienda != null) {
            Producto productoEnTienda = encontrarProductoEnTienda(tienda, producto);
            if (productoEnTienda != null) {
                if (haySuficienteStock(productoEnTienda, cantidad)) {
                    realizarVenta(productoEnTienda, cantidad);
                } else {
                    System.out.println("No hay suficiente stock para realizar la venta.");
                }
            }
        }
    }

    private Tienda encontrarTiendaPorId(int idTienda) {
        for (Tienda tienda : tiendas) {
            if (tienda.getIdTienda() == idTienda) {
                return tienda;
            }
        }
        return null;
    }

    private Producto encontrarProductoEnTienda(Tienda tienda, Producto producto) {
        for (Producto p : tienda.getProductos()) {
            if (p.getId() == producto.getId()) {
                return p;
            }
        }
        return null;
    }

    private boolean haySuficienteStock(Producto producto, int cantidad) {
        return producto.getStock() >= cantidad;
    }

    private void realizarVenta(Producto producto, int cantidad) {
        producto.setStock(producto.getStock() - cantidad);
    }

    public int stockProductos(int idTienda, Producto producto) {
        for (Tienda tienda : tiendas) {
            if (tienda.getIdTienda() == idTienda) {
                for (Producto p : tienda.getProductos()) {
                    if (p.getId() == producto.getId()) {
                        return p.getStock();
                    }
                }
            }
        }
        return 0;  // Producto no encontrado
    }

    public List<Tienda> getTiendas() {
        return tiendas;
    }
}
