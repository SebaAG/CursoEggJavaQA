import entidad.Meses;
import service.MesesService;

public class Main {
    public static void main(String[] args) {
        MesesService service = new MesesService();
        Meses mes = service.crearMeses();
        service.adivinar(mes);
    }
}