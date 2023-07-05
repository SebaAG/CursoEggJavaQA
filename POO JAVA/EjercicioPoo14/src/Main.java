import entidad.Celular;
import service.CelularService;

public class Main {
    public static void main(String[] args) {
        CelularService service = new CelularService();
        service.crearCelular();

        Celular celular = service.getCelu();
        System.out.println(celular.toString());
    }
}