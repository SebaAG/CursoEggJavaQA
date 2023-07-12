package org.example.service.menu;

import org.example.entity.Cliente;
import org.example.service.inmemory.ClienteMemoryService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

public class ClienteMenu {
    private static final Scanner tecla = new Scanner(System.in).useDelimiter("\n");
    private final ClienteMemoryService cms = new ClienteMemoryService();

    void menuClientes() {
        int opc;
        do {
            showMenuClientes();
            opc = obtOpc();
            ejectOpcClientes(opc);
        } while (opc != 5);
    }

    private void showMenuClientes() {
        System.out.println("""
                *** MENU ***
                1. REGISTRAR CLIENTE
                2. OBTENER CLIENTES
                3. ACTUALIZAR DATOS DE CLIENTE
                4. ELIMINAR CLIENTE
                5. VOLVER
                
                SELECCIONE UNA OPCIÓN:""");
    }

    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }

    private void ejectOpcClientes(int opc) {
        switch (opc) {
            case 1 -> registrarCliente();
            case 2 -> obtenerClientes();
            case 3 -> actualizarCliente();
            case 4 -> eliminarCliente();
            case 5 -> System.out.println("Volviendo al menú principal...");
            default -> System.out.println("Opción inválida.");
        }
    }

    /**
     * Permite al usuario registrar un nuevo cliente.
     * Verifica si ya se han registrado 5 clientes y muestra un mensaje de error si es el caso.
     * Solicita al usuario que ingrese los datos del cliente: nombre, edad, altura, peso y objetivo.
     * Crea un nuevo objeto Cliente y establece los valores ingresados utilizando setters.
     * Llama al servicio de clientes (ClienteMemoryService) para registrar el nuevo cliente.
     * Muestra un mensaje de éxito si el cliente se registra correctamente.
     */
    private void registrarCliente() {
        if (cms.obtenerClientes().size() >= 5) {
            System.out.println("Ya se han registrado 5 clientes. No es posible registrar más.");
        } else {
            System.out.println("Ingrese los datos del cliente:");
            System.out.print("Ingresar nombre: ");
            String nombre = tecla.next();
            System.out.print("Ingresar edad: ");
            int edad = tecla.nextInt();
            System.out.print("Ingresar altura: ");
            double altura = tecla.nextDouble();
            System.out.print("Ingresar peso: ");
            double peso = tecla.nextDouble();
            System.out.print("Ingresar objetivo: ");
            String objetivo = tecla.next();

            Cliente nuevoCliente = new Cliente();
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setEdad(edad);
            nuevoCliente.setAltura(altura);
            nuevoCliente.setPeso(peso);
            nuevoCliente.setObjetivo(objetivo);

            cms.registrarCliente(nuevoCliente);
            System.out.println("Cliente registrado con éxito.");
        }
    }

    /**
     * Permite al usuario obtener la lista de clientes registrados.
     * Imprime un mensaje indicando que se mostrará la lista de clientes.
     * Utiliza el sistema de gestión de clientes (ClienteMemoryService) para obtener la lista de clientes.
     * Itera sobre cada cliente en la lista y lo imprime en la consola.
     */
    private void obtenerClientes() {
        System.out.println("Lista de clientes:");
        List<Cliente> clientes = cms.obtenerClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    /**
     * Permite al usuario actualizar los datos de un cliente existente.
     * Solicita al usuario que ingrese el ID del cliente a actualizar.
     * Luego, solicita al usuario que ingrese el nuevo nombre, edad, altura, peso y objetivo del cliente.
     * Utiliza el servicio de clientes (ClienteMemoryService) para actualizar los datos del cliente
     * con los nuevos valores.
     * Si el cliente se actualiza correctamente, muestra un mensaje de éxito y la información del cliente actualizado.
     * Si no se encuentra el cliente con el ID especificado, muestra un mensaje de error.
     */
    private void actualizarCliente() {
        System.out.print("Ingrese el ID del cliente a actualizar: ");
        UUID idActualizar = UUID.fromString(tecla.next());
        System.out.print("Ingresar nuevo nombre: ");
        String nuevoNombre = tecla.next();
        System.out.print("Ingresar nueva edad: ");
        int nuevaEdad = tecla.nextInt();
        System.out.print("Ingresar nueva altura: ");
        double nuevaAltura = tecla.nextDouble();
        System.out.print("Ingresar nuevo peso: ");
        double nuevoPeso = tecla.nextDouble();
        System.out.print("Ingresar nuevo objetivo: ");
        String nuevoObjetivo = tecla.next();

        Optional<Cliente> clienteActualizado = cms.actualizarCliente(idActualizar, nuevoNombre, nuevaEdad,
                nuevaAltura, nuevoPeso, nuevoObjetivo);

        if (clienteActualizado.isPresent()) {
            System.out.println("Cliente actualizado con éxito:");
            System.out.println(clienteActualizado.get());
        } else {
            System.out.println("No se encontró el cliente con el ID especificado.");
        }
    }

    /**
     * Permite al usuario eliminar un cliente existente.
     * Solicita al usuario que ingrese el ID del cliente a eliminar.
     * Utiliza el servicio de clientes (ClienteMemoryService) para eliminar el cliente.
     * Si el cliente se elimina correctamente, muestra un mensaje de éxito.
     * Si no se encuentra el cliente con el ID especificado, muestra un mensaje de error.
     */
    private void eliminarCliente() {
        System.out.print("Ingrese el ID del cliente a eliminar: ");
        UUID idEliminar = UUID.fromString(tecla.next());
        boolean eliminado = cms.eliminarCliente(idEliminar);

        if (eliminado) {
            System.out.println("Cliente eliminado con éxito.");
        } else {
            System.out.println("No se encontró el cliente con el ID especificado.");
        }
    }
}
