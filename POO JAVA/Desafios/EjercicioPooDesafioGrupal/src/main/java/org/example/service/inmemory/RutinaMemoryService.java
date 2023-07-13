package org.example.service.inmemory;

import org.example.entity.Rutina;
import org.example.service.RutinaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class RutinaMemoryService implements RutinaService {
    private final List<Rutina> rutinas;

    public RutinaMemoryService() {
        this.rutinas = new ArrayList<>();
    }

    /**
     * Este método registra una nueva rutina.
     * Genera un nuevo UUID como identificador único para la rutina y lo asigna proporcionado como parámetro.
     * Luego, agrega la rutina a una lista interna de rutinas.
     * No devuelve ningún resultado (void).
     *
     * @param rutina la rutina a registrar
     */
    @Override
    public void registrarRutina(Rutina rutina) {
        UUID id = UUID.randomUUID();
        rutina.setId(id);
        rutinas.add(rutina);
    }

    /**
     * Este método devuelve una lista de objetos Rutina.
     * Su propósito es obtener todas las rutinas registradas y devolverlas como una lista.
     *
     * @return una lista de rutinas
     */
    @Override
    public List<Rutina> obtenerRutina() {
        return rutinas;
    }

    /**
     * Este método actualiza una rutina existente identificada por su id.
     * Los parámetros que se utilizan representan los nuevos valores que se utilizarán para actualizar la rutina.
     * El método devuelve un objeto Optional<Rutina> que puede contener la rutina actualizada si se encuentra o estar
     * vacío si no se encuentra.
     *
     * @param id              el ID de la rutina a actualizar
     * @param nombre          el nuevo nombre de la rutina
     * @param duracion        la nueva duración de la rutina
     * @param nivelDificultad el nuevo nivel de dificultad de la rutina
     * @param descripcion     la nueva descripción de la rutina
     * @return un objeto Optional que contiene la rutina actualizada, o un Optional vacío si no se encuentra la rutina
     */
    @Override
    public Optional<Rutina> actualizaRutina(UUID id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        for (Rutina rutina : rutinas) {
            if (rutina.getId().equals(id)) {
                rutina.setNombre(nombre);
                rutina.setDuracion(duracion);
                rutina.setNivelDificultad(nivelDificultad);
                rutina.setDescripcion(descripcion);
                return Optional.of(rutina);
            }
        }
        return Optional.empty();
    }

    /**
     * Este método elimina una rutina existente identificada por su id.
     * Devuelve true si la rutina se elimina con éxito y false si no se encuentra.
     *
     * @param id el ID de la rutina a eliminar
     * @return true si la rutina se elimina correctamente, o false si no se encuentra
     */
    @Override
    public boolean eliminaRutina(UUID id) {
        for (Rutina rutina : rutinas) {
            if (rutina.getId().equals(id)) {
                rutinas.remove(rutina);
                return true;
            }
        }
        return false;
    }
}