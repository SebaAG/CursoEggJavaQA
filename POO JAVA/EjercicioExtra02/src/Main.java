import servicio.PuntosService;

public class Main {
    public static void main(String[] args) {
        PuntosService p = new PuntosService();
        p.crearPuntos();
        System.out.println(p);
    }
}