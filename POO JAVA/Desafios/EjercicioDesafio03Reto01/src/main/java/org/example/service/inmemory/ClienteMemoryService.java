package org.example.service.inmemory;

import org.example.entity.Cliente;
import org.example.service.ClienteService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ClienteMemoryService implements ClienteService {
    private final List<Cliente> clientes;

    public ClienteMemoryService() {
        this.clientes = new ArrayList<>();
    }

    /**
     * Este método registra un nuevo cliente.
     * Genera un nuevo UUID como identificador único para el cliente y lo asigna al cliente proporcionado como parámetro.
     * Luego, agrega el cliente a una lista interna de clientes.
     * No devuelve ningún resultado (void).
     *
     * @param cliente el cliente a registrar
     */
    @Override
    public void registrarCliente(Cliente cliente) {
        UUID id = UUID.randomUUID();
        cliente.setId(id);
        clientes.add(cliente);
    }

    /**
     * Este método devuelve la lista de todos los clientes registrados.
     *
     * @return una lista de clientes
     */
    @Override
    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    /**
     * Este método actualiza un cliente existente identificado por su id.
     * Recorre la lista de clientes y busca un cliente con el ID proporcionado.
     * Si encuentra el cliente, actualiza sus propiedades con los nuevos valores proporcionados y devuelve un
     * objeto Optional<Cliente> que contiene el cliente actualizado. Si no encuentra el cliente,
     * devuelve un objeto Optional vacío.
     *
     * @param id      el ID del cliente a actualizar
     * @param nombre  el nuevo nombre del cliente
     * @param edad    la nueva edad del cliente
     * @param altura  la nueva altura del cliente
     * @param peso    el nuevo peso del cliente
     * @param objetivo el nuevo objetivo del cliente
     * @return un objeto Optional que contiene el cliente actualizado, o un Optional vacío si no se encuentra el cliente
     */
    @Override
    public Optional<Cliente> actualizarCliente(UUID id, String nombre, int edad, double altura,
                                               double peso, String objetivo) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
                return Optional.of(cliente);
            }
        }
        return Optional.empty();
    }

    /**
     * Este método elimina un cliente existente identificado por su id.
     * Recorre la lista de clientes, busca un cliente con el ID proporcionado y lo elimina de la lista.
     * Devuelve true si el cliente se elimina correctamente y false si no se encuentra.
     *
     * @param id el ID del cliente a eliminar
     * @return true si el cliente se elimina correctamente, o false si no se encuentra
     */
    @Override
    public boolean eliminarCliente(UUID id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                clientes.remove(cliente);
                return true;
            }
        }
        return false;
    }
}