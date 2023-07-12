package org.example.service;

import org.example.entity.Rutina;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Esta interfaz define los métodos que deben ser implementados por las clases que ofrecen servicios
 * relacionados con los clientes.
 * Proporciona una abstracción común para interactuar con diferentes implementaciones del servicio de clientes,
 * sin conocer los detalles internos de cada implementación.
 * Permite la creación de componentes desacoplados y flexibles, ya que el código que utiliza esta interfaz
 * puede trabajar con cualquier clase que la implemente, sin importar cómo se implemente.
 * Cada método representa una operación específica que se puede realizar en el servicio de clientes,
 * como registrar un cliente, obtener clientes, actualizar clientes o eliminar clientes.
 * Es importante tener en cuenta que esta interfaz no proporciona la implementación real de los métodos,
 * sino solo la declaración de los mismos.
 * Las clases concretas que implementan esta interfaz deben proporcionar la implementación de cada método
 * según sus necesidades específicas.
 */
public interface RutinaService {
    void registrarRutina(Rutina rutina);
    List<Rutina> obtenerRutina();
    Optional<Rutina> actualizaRutina(UUID id, String nombre, int duracion, String nivelDificultad, String descripcion);
    boolean eliminaRutina(UUID id);
}
