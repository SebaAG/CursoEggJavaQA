import entidad.Circunferencia;
import service.CircunferenciaService;

public class Main {
    public static void main(String[] args) {
        CircunferenciaService serv = new CircunferenciaService();
        Circunferencia circ = serv.crearCirc();
        serv.mostrarResult(circ); // Pasar la instancia de Circunferencia como argumento
    }
}