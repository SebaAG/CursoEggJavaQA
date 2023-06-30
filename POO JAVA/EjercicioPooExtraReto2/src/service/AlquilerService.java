package service;

import entidad.Alquiler;
import entidad.Pelicula;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AlquilerService {
    private final Alquiler[] alquiler;
    private int alqCont;

    /**
     * Constructor de la clase AlquilerService.
     * Crea una instancia de AlquilerService con el tamaño máximo especificado para el arreglo de alquileres.
     * Inicializa el arreglo de alquileres y establece el contador de alquileres en 0.
     * @param alqMax Tamaño máximo del arreglo de alquileres.
     */
    public AlquilerService(int alqMax) {
        alquiler = new Alquiler[alqMax];
        alqCont = 0;
    }
    /**
     * Crea un nuevo alquiler y lo agrega al arreglo de alquileres.
     * Se verifica si el límite de alquileres ha sido alcanzado antes de agregar un nuevo alquiler.
     * Si el límite se ha alcanzado, se muestra un mensaje de error.
     *
     * @param pelicula  La película a alquilar.
     * @param fechaIni  La fecha de inicio del alquiler.
     * @param fechaFin  La fecha de entrega del alquiler.
     * @param precio    El precio del alquiler.
     */
    public void crearAlquiler(Pelicula pelicula, LocalDate fechaIni, LocalDate fechaFin, Double precio) {
        if (alqCont < alquiler.length) {
            Alquiler alq1 = new Alquiler(pelicula, fechaIni, fechaFin, precio);
            alquiler[alqCont++] = alq1;
        } else {
            System.out.println("No se puede agregar el alquiler. El límite ha sido alcanzado.");
        }
    }
    /**
     * Muestra en consola la lista de alquileres registrados.
     * Se comprueba si no hay alquileres registrados y se muestra un mensaje correspondiente.
     */
    public void listarAlquileres() {
        System.out.println("*****Alquileres*****");
        if (alqCont == 0) {
            System.out.println("No hay alquileres registrados.");
        } else {
            for(int i = 0; i < alqCont; ++i) {
                System.out.println(alquiler[i]);
            }
        }
    }
    /**
     * Busca un alquiler basado en una fecha dada.
     * Se busca un alquiler basado en una fecha dada.
     * Si se encuentra un alquiler que se superpone con la fecha dada, se devuelve ese alquiler.
     *
     * @param fecha     La fecha a buscar.
     * @return          El alquiler encontrado, o null si no se encontró ningún alquiler en esa fecha.
     */
    public Alquiler buscarAlquiler(LocalDate fecha) {
        for(int i = 0; i < alqCont; ++i) {
            Alquiler alq = alquiler[i];
            if (fecha.isAfter(alq.getFechaIni()) && fecha.isBefore(alq.getFechaFin())) {
                return alq;
            }
        }
        return null;
    }
    /**
     * Calcula el precio total de todos los alquileres, teniendo en cuenta los recargos por retraso.
     * Se calcula el precio total de todos los alquileres teniendo en cuenta los recargos por retraso.
     * Se utiliza la clase ChronoUnit para calcular el número de días de retraso y se aplica un recargo del 10%
     * al precio del alquiler por cada día de retraso.
     * El precio total de todos los alquileres, incluidos los recargos, se devuelve al final del método
     *
     * @return  El precio total de los alquileres.
     */
    public double calcularPrecio() {
        double ingresoTotal = 0.0;
        LocalDate fechaHoy = LocalDate.now();
        for (int i = 0; i < alqCont; ++i) {
            Alquiler alq = alquiler[i];
            double precioAlquiler = alq.getPrecio();
            LocalDate fechaFin = alq.getFechaFin();
            if (fechaHoy.isAfter(fechaFin)) {
                // Calcular días de retraso
                long diasRetraso = ChronoUnit.DAYS.between(fechaFin, fechaHoy);
                // Calcular recargo
                double recargo = precioAlquiler * diasRetraso * 0.1;
                // Aplicar recargo al precio del alquiler
                precioAlquiler += recargo;
            }
            alq.setPrecio(precioAlquiler);
            ingresoTotal += precioAlquiler;
        }
        return ingresoTotal;
    }
}