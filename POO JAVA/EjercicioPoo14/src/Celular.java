import java.math.BigDecimal;
import java.util.Scanner;

public class Celular {
    private String marca;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private StringBuilder codigo;
    private BigDecimal precio;

    @Override
    public String toString() {
        return "Marca del celular: '" + marca + '\n' +
                "Modelo del celular: '" + modelo + '\n' +
                "Memoria ram: " + memoriaRam + '\n' +
                "Almacenamiento: " + almacenamiento + '\n' +
                "Codigo: " + codigo + '\n' +
                "Precio: " + precio + '\n';
    }

    public Celular() {
    }

    public Celular(String marca, String modelo, int memoriaRam, int almacenamiento, StringBuilder codigo, BigDecimal precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public StringBuilder getCodigo() {
        return codigo;
    }

    public void setCodigo(StringBuilder codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    Scanner tecla = new Scanner(System.in);

    public void crearCelular(){


        System.out.println("Ingresar marca del celular: ");
        setMarca(tecla.nextLine());
        System.out.println("Ingresar el modelo del celular: ");
        setModelo(tecla.nextLine());
        System.out.println("Ingrese la cantidad de memoria ram: ");
        setMemoriaRam(tecla.nextInt());
        System.out.println("Ingrese el almacenamiento del celular: ");
        setAlmacenamiento(tecla.nextInt());
        System.out.println("Ingrese el valor(precio) del celular: ");
        setPrecio(tecla.nextBigDecimal());
        System.out.println("Ingresar los digitos del codigo del celular: ");
        setCodigo(setearCodigo());
    }

    public StringBuilder setearCodigo() {
        StringBuilder codcel = new StringBuilder();
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el digito " + (i + 1));
            codigo[i] = tecla.nextInt();
            codcel.append(codigo[i]);
        }
        return codcel;
    }
}