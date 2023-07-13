package service;

import entidad.Celular;

import java.util.Scanner;

public class CelularService {
    private final Celular celu = new Celular();
    Scanner tecla = new Scanner(System.in);
    /**
     * Permite al usuario crear un nuevo celular ingresando los datos correspondientes.
     */
    public void crearCelular() {
        System.out.println("Ingresar marca del celular: ");
        celu.setMarca(tecla.nextLine());
        System.out.println("Ingresar el modelo del celular: ");
        celu.setModelo(tecla.nextLine());
        System.out.println("Ingrese la cantidad de memoria RAM: ");
        celu.setMemoriaRam(tecla.nextInt());
        System.out.println("Ingrese el almacenamiento del celular: ");
        celu.setAlmacenamiento(tecla.nextInt());
        System.out.println("Ingrese el valor (precio) del celular: ");
        celu.setPrecio(tecla.nextBigDecimal());
        System.out.println("Ingresar los dígitos del código del celular: ");
        celu.setCodigo(setearCodigo());
    }
    /**
     * Permite al usuario ingresar los dígitos del código del celular y devuelve el código completo.
     *
     * @return el código completo del celular
     */
    public StringBuilder setearCodigo() {
        StringBuilder codcel = new StringBuilder();
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el dígito " + (i + 1));
            codigo[i] = tecla.nextInt();
            codcel.append(codigo[i]);
        }
        return codcel;
    }
    /**
     * Obtiene el celular creado.
     *
     * @return el objeto celular creado
     */
    public Celular getCelu() {
        return celu;
    }
}
