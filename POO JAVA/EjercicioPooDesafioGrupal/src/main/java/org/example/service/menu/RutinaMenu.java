package org.example.service.menu;

import org.example.entity.Rutina;
import org.example.service.inmemory.RutinaMemoryService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

public class RutinaMenu {
    private static final Scanner tecla = new Scanner(System.in).useDelimiter("\n");
    private final RutinaMemoryService rms = new RutinaMemoryService();

    void menuRutinas() {
        int opc;
        do {
            showMenuRutinas();
            opc = obtOpc();
            ejectOpcRutinas(opc);
        } while (opc != 5);
    }

    private void showMenuRutinas() {
        System.out.println("""
                *** MENU ***
                1. REGISTRAR RUTINA
                2. OBTENER RUTINA
                3. ACTUALIZAR DATOS DE LA RUTINA
                4. ELIMINAR RUTINA
                5. VOLVER
                
                SELECCIONE UNA OPCIÓN:""");
    }

    private void ejectOpcRutinas(int opc) {
        switch (opc) {
            case 1 -> registrarRutina();
            case 2 -> obtenerRutina();
            case 3 -> actualizarRutina();
            case 4 -> eliminarRutina();
            case 5 -> System.out.println("Volviendo al menú principal...");
            default -> System.out.println("Opción inválida.");
        }
    }

    private static int obtOpc() {
        System.out.println("Seleccione que desea realizar: ");
        return tecla.nextInt();
    }

    /**
     * Permite al usuario registrar una nueva rutina.
     * Si ya se han registrado 5 rutinas, muestra un mensaje de error.
     * Solicita al usuario que ingrese los datos de la rutina: nombre, duración, nivel de dificultad y descripción.
     * Crea un nuevo objeto Rutina y establece los valores ingresados utilizando setters.
     * Luego, llama al servicio de rutinas (RutinaMemoryService) para registrar la nueva rutina.
     * Muestra un mensaje de éxito si la rutina se registra correctamente.
     */
    private void registrarRutina() {
        if (rms.obtenerRutina().size() >= 5) {
            System.out.println("Ya se han registrado 5 rutinas. No es posible registrar más.");
        } else {
            System.out.println("Ingrese los datos de la rutina:");
            System.out.print("Ingresar nombre: ");
            String nombre = tecla.next();
            System.out.print("Ingresar duracion: ");
            int duracion = tecla.nextInt();
            System.out.print("Ingresar nivel de dificultad: ");
            String nivelDificultad = tecla.next();
            System.out.print("Ingresar descripción: ");
            String descripcion = tecla.next();

            Rutina nuevaRutina = new Rutina();
            nuevaRutina.setNombre(nombre);
            nuevaRutina.setDuracion(duracion);
            nuevaRutina.setNivelDificultad(nivelDificultad);
            nuevaRutina.setDescripcion(descripcion);

            rms.registrarRutina(nuevaRutina);
            System.out.println("Rutina registrada con éxito.");
        }
    }

    /**
     * Permite al usuario obtener la lista de rutinas disponibles.
     * Imprime un mensaje indicando que se mostrará la lista de rutinas.
     * Utiliza el sistema de gestión de rutinas (RutinaMemoryService) para obtener la lista de rutinas.
     * Itera sobre cada rutina en la lista y la imprime en la consola.
     */
    private void obtenerRutina() {
        System.out.println("Lista de Rutinas:");
        List<Rutina> rutinas = rms.obtenerRutina();
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }
    }

    /**
     * Permite al usuario actualizar una rutina existente.
     * Solicita al usuario que ingrese el ID de la rutina a actualizar.
     * Luego, solicita al usuario que ingrese el nuevo nombre, duración, nivel de dificultad y descripción de la rutina.
     * Utiliza el servicio de rutinas (RutinaMemoryService) para actualizar la rutina con los nuevos valores.
     * Si la rutina se actualiza correctamente, muestra un mensaje de éxito y la información de la rutina actualizada.
     * Si no se encuentra la rutina con el ID especificado, muestra un mensaje de error.
     */
    private void actualizarRutina() {
        System.out.print("Ingrese el ID de la rutina a actualizar: ");
        UUID idActualizar = UUID.fromString(tecla.next());
        System.out.print("Ingresar nuevo nombre: ");
        String nuevoNombre = tecla.next();
        System.out.print("Ingresar nueva duración: ");
        int nuevaDuracion = tecla.nextInt();
        System.out.print("Ingresar nuevo nivel de dificultad: ");
        String nuevaDificultad = tecla.next();
        System.out.print("Ingresar nueva descripción: ");
        String nuevaDescripcion = tecla.next();

        Optional<Rutina> rutinaActualizada = rms.actualizaRutina(idActualizar, nuevoNombre, nuevaDuracion,
                nuevaDificultad, nuevaDescripcion );

        if (rutinaActualizada.isPresent()) {
            System.out.println("Rutina actualizada con éxito:");
            System.out.println(rutinaActualizada.get());
        } else {
            System.out.println("No se encontró la rutina con el ID especificado.");
        }
    }

    /**
     * Permite al usuario eliminar una rutina existente.
     * Solicita al usuario que ingrese el ID de la rutina a eliminar.
     * Utiliza el servicio de rutinas (RutinaMemoryService) para eliminar la rutina.
     * Si la rutina se elimina correctamente, muestra un mensaje de éxito.
     * Si no se encuentra la rutina con el ID especificado, muestra un mensaje de error.
     */
    private void eliminarRutina() {
        System.out.print("Ingrese el ID de la rutina a eliminar: ");
        UUID idEliminar = UUID.fromString(tecla.next());
        boolean eliminado = rms.eliminaRutina(idEliminar);

        if (eliminado) {
            System.out.println("Rutina eliminada con éxito.");
        } else {
            System.out.println("No se encontró la rutina con el ID especificado.");
        }
    }
}