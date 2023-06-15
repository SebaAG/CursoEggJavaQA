import java.util.Scanner;

public class Circunferencia {
    Scanner tecla = new Scanner(System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.print("Ingresar el radio de la circunferencia: ");
        radio = tecla.nextDouble();
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}