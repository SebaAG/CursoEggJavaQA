package org.example.service;

import org.example.entity.Producto;

import java.util.Scanner;

public class MenuService {



    private static final Scanner tecla = new Scanner(System.in);
    private final TiendaService tiendaService = new TiendaService();

    public void run() {
        int opc;
        do {
            showMenu();
            opc = obtOpc();
            ejectOpc(opc);
        } while (opc != 12);
    }

    private static void showMenu() {
        System.out.println("""
                *** MENU ***
                1. Crear Producto
                2. Mostrar Productos
                3. Modificar Producto
                4. Eliminar Producto
                5. Crear Tienda
                6. Mostrar Tiendas
                7. Modificar Tienda
                8. Eliminar Tienda
                9. Agregar Producto
                10. Realizar Venta
                11. Consultar Stock de Producto en Tienda
                12. Salir""");
        System.out.println();
    }

    private static int obtOpc() {
        System.out.print("Seleccione qué desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpc(int opc) {
        switch (opc) {
            case 1 -> crearProducto();
            case 2 -> tiendaService.mostrarProductos();
            case 3 -> modificarProducto();
            case 4 -> eliminarProducto();
            case 5 -> crearTienda();
            case 6 -> tiendaService.mostrarTiendas();
            case 7 -> modificarTienda();
            case 8 -> eliminarTienda();
            case 9 -> agregarProducto();
            case 10 -> productoVenta();
            case 11 -> checkStock();
            case 12 -> System.out.println("Adiós!");
            default -> System.out.println("Opción inválida.");
        }
    }

    private void checkStock() {
        System.out.print("Ingrese ID de tienda: ");
        int idTienda = tecla.nextInt();

        System.out.print("Ingrese ID de producto: ");
        int idProducto = tecla.nextInt();
        tecla.nextLine();

        Producto producto = new Producto();
        producto.setId(idProducto);

        int stock = tiendaService.stockProductos(idTienda, producto);
        System.out.println("Stock de Producto en Tienda: " + stock);
    }

    private void productoVenta() {
        System.out.print("Ingrese ID de tienda: ");
        int idTienda = tecla.nextInt();

        System.out.print("Ingrese ID de producto: ");
        int idProducto = tecla.nextInt();

        System.out.print("Ingrese cantidad a vender: ");
        int cantidad = tecla.nextInt();
        tecla.nextLine();

        Producto producto = new Producto();
        producto.setId(idProducto);

        tiendaService.venderProductos(idTienda, producto, cantidad);
        System.out.println("Venta exitosa!");
    }

    private void agregarProducto() {
        System.out.print("Ingrese ID de tienda: ");
        int idTienda = tecla.nextInt();

        System.out.print("Ingrese ID de producto: ");
        int idProducto = tecla.nextInt();

        System.out.print("Ingrese cantidad a agregar: ");
        int cantidad = tecla.nextInt();
        tecla.nextLine();

        Producto producto = new Producto();
        producto.setId(idProducto);

        tiendaService.agregarProductos(idTienda, producto, cantidad);
    }

    private void eliminarTienda() {
        System.out.print("Ingrese ID de la tienda a eliminar: ");
        int idTienda = tecla.nextInt();
        tecla.nextLine();
        tiendaService.eliminarTienda(idTienda);
    }

    private void modificarTienda() {
        System.out.print("Ingrese ID de tienda: ");
        int idTienda = tecla.nextInt();
        tecla.nextLine();

        System.out.print("Ingrese nueva dirección: ");
        String nuevaDireccion = tecla.nextLine();

        System.out.print("Ingrese nuevo representante: ");
        String nuevoRepresentante = tecla.nextLine();

        tiendaService.modificarTienda(idTienda, nuevaDireccion, nuevoRepresentante);
    }

    private void crearTienda() {
        System.out.print("Ingrese ID de tienda: ");
        int idTienda = tecla.nextInt();
        tecla.nextLine();

        System.out.print("Ingrese dirección: ");
        String direccion = tecla.nextLine();

        System.out.print("Ingrese representante: ");
        String representante = tecla.nextLine();

        tiendaService.crearTienda(idTienda, direccion, representante);

        // Agregar productos a la tienda recién creada
        System.out.print("¿Desea agregar productos a la tienda recién creada? (S/N): ");
        String respuesta = tecla.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            agregarProductosATienda(idTienda);
        }
    }

    private void agregarProductosATienda(int idTienda) {
        // Solicitar detalles del producto
        System.out.print("Ingrese ID de producto: ");
        int idProducto = tecla.nextInt();
        tecla.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = tecla.nextLine();

        // Solicitar cantidad a agregar al stock
        System.out.print("Ingrese cantidad a agregar: ");
        int cantidad = tecla.nextInt();
        tecla.nextLine();

        // Crear el producto y agregarlo a la tienda
        Producto producto = new Producto();
        producto.setId(idProducto);
        producto.setNombre(nombre);
        tiendaService.agregarProductos(idTienda, producto, cantidad);
    }

    private void eliminarProducto() {
        System.out.print("Ingrese ID del producto a eliminar: ");
        int id = tecla.nextInt();
        tecla.nextLine();
        tiendaService.eliminarProducto(id);
    }

    private void modificarProducto() {
        System.out.print("Ingrese ID de producto a modificar: ");
        int id = tecla.nextInt();
        tecla.nextLine();

        System.out.print("Ingrese nuevo nombre: ");
        String nuevoNombre = tecla.nextLine();

        System.out.print("Ingrese nuevo precio: ");
        double nuevoPrecio = tecla.nextDouble();
        tecla.nextLine();

        tiendaService.modificarProducto(id, nuevoNombre, nuevoPrecio);
    }

    private void crearProducto() {
        System.out.print("Ingrese ID de producto: ");
        int id = tecla.nextInt();
        tecla.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = tecla.nextLine();

        System.out.print("Ingrese precio: ");
        double precio = tecla.nextDouble();
        tecla.nextLine();

        tiendaService.crearProducto(id, nombre, precio);
    }
}
