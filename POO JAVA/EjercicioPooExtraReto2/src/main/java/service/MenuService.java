package service;

import entidad.Alquiler;
import entidad.Pelicula;
import java.time.LocalDate;
import java.util.Scanner;

public class MenuService {
    Scanner read = new Scanner(System.in);
    // Crear una instancia de PeliculaService con un límite de 5 películas
    PeliculaService peliService = new PeliculaService(5);
    // Crear una instancia de AlquilerService con un límite de 3 alquileres
    // y se pasa una instancia de PeliculaService como parámetro para acceder a la funcionalidad de películas
    AlquilerService alquiService = new AlquilerService(3, peliService);
    /**
     * Ejecuta el programa principal.
     */
    public void run() {
        int opc;
        do {
            menu();
            opc = obtenerOpcion();
            ejecutarOpcion(opc);
        } while(opc != 9);
    }
    /**
     * Muestra el menú principal en la consola.
     * Muestra las opciones disponibles para el usuario.
     */
    private static void menu() {
        System.out.println("--------Menú Principal--------");
        System.out.println("1.Cargar una Película");
        System.out.println("2.Lista de Películas");
        System.out.println("3.Cargar un Alquiler");
        System.out.println("4.Lista de Alquileres");
        System.out.println("5.Buscar Película por Título");
        System.out.println("6.Buscar Películas por Género");
        System.out.println("7.Buscar Alquiler por Fecha");
        System.out.println("8.Ingreso total del servicio");
        System.out.println("9.Salir");
    }
    /**
     * Obtiene la opción seleccionada por el usuario.
     * Solicita al usuario que seleccione una opción del menú y devuelve la opción seleccionada.
     * @return La opción seleccionada por el usuario.
     */
    private int obtenerOpcion() {
        System.out.println("Seleccione que desea realizar: ");
        return read.nextInt();
    }
    /**
     * Ejecuta la opción seleccionada por el usuario.
     * Realiza la acción correspondiente según la opción seleccionada por el usuario.
     * @param opc La opción seleccionada por el usuario.
     */
    private void ejecutarOpcion(int opc) {
        read.nextLine();
        switch (opc) {
            case 1 -> cargarPelicula();
            case 2 -> peliService.listarPeliculas();
            case 3 -> cargarAlquiler();
            case 4 -> alquiService.listarAlquileres();
            case 5 -> buscarPeliTitulo();
            case 6 -> buscarPeliGenero();
            case 7 -> buscarAlquilerFecha();
            case 8 -> precioTotal();
            case 9 -> System.out.println("Gracias por utilizar BlockBuster");
            default -> System.out.println("Haz ingresado una opción incorrecta");
        }
    }
    /**
     * Carga los datos de una nueva película.
     * Solicita al usuario el título, género, año y duración de la película y la crea utilizando
     * el servicio correspondiente.
     */
    private void cargarPelicula() {
        System.out.println("Ingresar título: ");
        String titulo = read.nextLine();
        System.out.println("Ingresa el género: ");
        String genero = read.nextLine();
        System.out.println("Año: ");
        int anio = read.nextInt();
        System.out.println("Duración: ");
        int duracion = read.nextInt();
        peliService.crearPelicula(titulo, genero, anio, duracion);
    }
    /**
     * Carga un nuevo alquiler de una película.
     * Se verifica si la película está disponible para ser alquilada.
     * Solícita al usuario el título de la película a alquilar y las fechas de inicio y finalización del alquiler.
     * Si la película no se encuentra, se muestra un mensaje de error.
     */
    private void cargarAlquiler() {
        System.out.println("Ingresa el título de la película a alquilar: ");
        String tituloAlquiler = read.nextLine();
        Pelicula peliculaAlquiler = peliService.buscarTitulo(tituloAlquiler);
        if (peliculaAlquiler == null) {
            System.out.println("Película no encontrada");
        } else {
            boolean peliDisp = alquiService.verificarPeliAlquiler(peliculaAlquiler);
            if (!peliDisp) {
                System.out.println("La película no está disponible para alquilar");
            } else {
            System.out.println("Ingresa la fecha de Inicio: ");
            System.out.println("Ingrese el día: ");
            int dia = read.nextInt();
            System.out.println("Ingrese el mes: ");
            int mes = read.nextInt();
            System.out.println("Ingrese el año: ");
            int anio1 = read.nextInt();
            LocalDate fechaIni = LocalDate.of(anio1, mes, dia);
            System.out.println("Ingresa la fecha de Finalización: ");
            System.out.println("Ingrese el día: ");
            int diaFin = read.nextInt();
            System.out.println("Ingrese el mes: ");
            int mesFin = read.nextInt();
            System.out.println("Ingrese el año: ");
            int anioFin = read.nextInt();
            LocalDate fechaFin = LocalDate.of(anioFin, mesFin, diaFin);
            double precioAlquiler = 10.0;
            alquiService.crearAlquiler(peliculaAlquiler.getTitulo(), fechaIni, fechaFin, precioAlquiler);
            }
        }
    }
    /**
     * Busca una película por su título.
     * Solícita al usuario el título de la película a buscar y muestra la información de la película si es encontrada.
     * Si la película no existe, se muestra un mensaje de error.
     */
    private void buscarPeliTitulo() {
        System.out.println("Ingresa el título de la película a buscar:");
        String titulo1 = read.nextLine();
        Pelicula encontrada = peliService.buscarTitulo(titulo1);
        if (encontrada == null) {
            System.out.println("La película no existe");
        } else {
            System.out.println("Película Encontrada" + '\n' + encontrada);
        }
    }
    /**
     * Busca películas por su género.
     * Solicita al usuario el género a buscar y muestra las películas encontradas que coinciden con ese género.
     * Si no hay películas del género especificado, se muestra un mensaje indicándolo.
     */
    private void buscarPeliGenero() {
        int mes2;
        int anio2;
        System.out.println("Ingresa el género a buscar:");
        String genero1 = read.nextLine();
        Pelicula[] encontrado = peliService.buscarGenero(genero1);
        if (encontrado.length == 0) {
            System.out.println("No hay películas de ese género");
        } else {
            System.out.println("Las películas que se encontraron son: ");
            mes2 = encontrado.length;
            for (anio2 = 0; anio2 < mes2; ++anio2) {
                Pelicula peliculas = encontrado[anio2];
                System.out.println(peliculas);
            }
        }
    }
    /**
     * Busca un alquiler por una fecha específica.
     * Solicita al usuario la fecha (día, mes y año) y muestra el alquiler encontrado si existe.
     * Si no se encuentra ningún alquiler en esa fecha, se muestra un mensaje de error.
     */
    private void buscarAlquilerFecha() {
        int mes2;
        int anio2;
        System.out.println("----- Buscar Alquiler por Fecha -----");
        System.out.println("Ingrese la fecha (dd/mm/aaaa): ");
        System.out.println("Ingrese el día: ");
        int dia2 = read.nextInt();
        System.out.println("Ingrese el mes: ");
        mes2 = read.nextInt();
        System.out.println("Ingrese el año: ");
        anio2 = read.nextInt();
        LocalDate fechaBusqueda = LocalDate.of(anio2, mes2, dia2);
        Alquiler alquilerFecha = alquiService.buscarAlquiler(fechaBusqueda);
        if (alquilerFecha == null) {
            System.out.println("No se encontró ningún alquiler en esa fecha.");
        } else {
            System.out.println("Alquiler Encontrado" + '\n' + alquilerFecha);
        }
    }
    /**
     * Calcula el precio total de los alquileres, teniendo en cuenta los recargos por retraso, y muestra el resultado si
     * hay operaciones de cobro pendientes.
     * Se utiliza el método calcularPrecio() de la instancia de AlquilerService para obtener
     * el precio total de los alquileres.
     * Si el precio total es mayor que cero, se muestra un ticket con el monto total del servicio. De lo contrario, se
     * muestra un mensaje indicando que no hay operaciones de cobro pendientes.
     */
    private void precioTotal() {
        double ingresoTotal = alquiService.calcularPrecio();
        if (ingresoTotal > 0.0) {
            System.out.println("******Ticket******");
            System.out.println("El Monto total del servicio es: " + ingresoTotal + " $");
        } else {
            System.out.println("No hay operaciones de cobro pendientes.");
        }
    }
}
