package service;
import entidad.NIF;
import java.util.Scanner;

public class NIFService {
    private final Scanner tecla = new Scanner(System.in);

    public NIF crearNif() {
        NIF n1 = new NIF();
        System.out.println("Ingrese el DNI");

        n1.setDNI(tecla.nextInt());
        int NIF = (int) (n1.getDNI() % 23);

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
                "H", "L", "C", "K", "E"};

        n1.setLetra((letras[NIF]));
        return n1;
    }

    public void mostrar(NIF n1) {
        System.out.println(n1.getDNI() + "-" + n1.getLetra());
    }

}