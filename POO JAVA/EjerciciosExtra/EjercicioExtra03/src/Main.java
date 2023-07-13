import entidad.Raices;
import servicio.RaicesService;

public class Main {
    public static void main(String[] args) {
        Raices r = new Raices();
        r.setA(1);
        r.setB(-5);
        r.setC(2);
        RaicesService rs = new RaicesService(r);
        rs.calcular();
    }
}