import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());

        BigDecimal superficie = rectangulo.calcSuperficie();
        System.out.println("Superficie: " + superficie);
        BigDecimal perimetro = rectangulo.calcPerimetro();
        System.out.println("Perimetro: " + perimetro);

        System.out.println("Rectangulo dibujado: ");
        rectangulo.dibujarRecta();
    }
}