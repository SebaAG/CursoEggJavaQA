import entidad.Libro;
import service.LibroService;

public class Main {
    public static void main(String[] args) {
        LibroService servicio = new LibroService();
        Libro libro = servicio.cargaLibro();
        System.out.println(libro.toString());
    }
}