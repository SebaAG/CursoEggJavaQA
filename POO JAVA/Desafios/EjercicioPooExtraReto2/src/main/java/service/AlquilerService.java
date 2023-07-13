package service;

import entidad.Alquiler;
import entidad.Pelicula;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AlquilerService {
    private final Alquiler[] alquiler;
    private int alqCont;
    private final PeliculaService ps;

    /**
     * Constructor de la clase AlquilerService.
     * Crea una instancia de AlquilerService con el tamaño máximo especificado para el arreglo de alquileres.
     * Inicializa el arreglo de alquileres y establece el contador de alquileres en 0.
     *
     * @param alqMax Tamaño máximo del arreglo de alquileres.
     * @param ps     Instancia de PeliculaService para buscar películas.
     */
    public AlquilerService(int alqMax, PeliculaService ps) {
        alquiler = new Alquiler[alqMax];
        alqCont = 0;
        this.ps = ps;
    }
    /**
     * Crea un nuevo alquiler y lo agrega al arreglo de alquileres.
     * Verifica la existencia de la película a alquilar y muestra un mensaje de error si no existe.
     * Comprueba si la película ya ha sido alquilada previamente y muestra un mensaje correspondiente.
     * Verifica si el límite de alquileres ha sido alcanzado y muestra un mensaje de error si es el caso.
     * Si hay espacio disponible, crea un nuevo objeto Alquiler y lo agrega al arreglo de alquileres.
     *
     * @param tituloPe  La película a alquilar.
     * @param fechaIni  La fecha de inicio del alquiler.
     * @param fechaFin  La fecha de entrega del alquiler.
     * @param precio    El precio del alquiler.
     */
    public void crearAlquiler(String tituloPe, LocalDate fechaIni, LocalDate fechaFin, Double precio) {
        // Busca la película en el servicio de pelis
        Pelicula pelicula = ps.buscarTitulo(tituloPe);

        // Verifica si la película existe
        if (pelicula == null) {
            System.out.println("La película no existe.");
            return;
        }

        boolean peliDisp = true;
        for (int i = 0; i < alqCont; i++) {
            if (alquiler[i].getPelicula().equals(pelicula)) {
                peliDisp = false;
                break;
            }
        }
        if (peliDisp) {
            if (alqCont < alquiler.length) {
                Alquiler alq1 = new Alquiler(pelicula, fechaIni, fechaFin, precio);
                alquiler[alqCont++] = alq1;
            } else {
                System.out.println("No se puede agregar el alquiler. El límite ha sido alcanzado.");
            }
        } else {
            System.out.println("La película ya ha sido alquilada.");
        }
    }
    /**
     * Muestra en consola la lista de alquileres registrados.
     * Se comprueba si no hay alquileres registrados y se muestra un mensaje correspondiente.
     * (Alquiler alquiler : alquiler) permite iterar de manera más sencilla sobre los elementos de un arreglo o
     * una colección, en este caso, para realizar operaciones con los objetos Alquiler almacenados en el
     * arreglo alquileres.
     */
    public void listarAlquileres() {
        System.out.println("*****Alquileres*****");
        if (alqCont == 0) {
            System.out.println("No hay alquileres registrados.");
        } else {
            // Se utiliza el bucle for-each
            for(Alquiler alq : alquiler) {
                if (alq != null) {
                    System.out.println(alq);
                }
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
        for (Alquiler alq : alquiler) {
            if (alq != null && alq.getFechaIni().isEqual(fecha)) {
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
     * El precio total de todos los alquileres, incluidos los recargos, se devuelve al final del método.
     *
     * @return  El precio total de los alquileres.
     */
    public double calcularPrecio() {
        double ingresoTotal = 0.0;
        LocalDate fechaHoy = LocalDate.now();
        for (Alquiler alquiler : alquiler) {
            if (alquiler != null) {
                LocalDate fechaFin = alquiler.getFechaFin();
                if (fechaHoy.isAfter(fechaFin)) {
                    long diasRetraso = ChronoUnit.DAYS.between(fechaFin, fechaHoy);
                    double recargo = alquiler.getPrecio() * diasRetraso * 0.1;
                    alquiler.setPrecio(alquiler.getPrecio() + recargo);
                }
                ingresoTotal += alquiler.getPrecio();
            }
        }
        return ingresoTotal;
    }
    /**
     * Verifica si una película está disponible para alquilar.
     *
     * @param pelicula la película a verificar.
     * @return true si la película está disponible, false si ya está alquilada.
     */
    public boolean verificarPeliAlquiler(Pelicula pelicula) {
        for (int i = 0; i < alqCont; i++) {
            if (alquiler[i].getPelicula().equals(pelicula)) {
                return false; // La película ya esta alquilada
            }
        }
        return true; // La película está disponible
    }
}