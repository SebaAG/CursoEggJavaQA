import java.math.BigDecimal;
import java.util.Scanner;
public class Rectangulo {
    Scanner tecla = new Scanner(System.in);
    private BigDecimal base;
    private BigDecimal altura;

    public Rectangulo(BigDecimal base, BigDecimal altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

    }

    public BigDecimal getBase() {
        return base;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.print("Ingresar valor de la base: ");
        base = tecla.nextBigDecimal();
        System.out.print("Ingresar valor de la altura: ");
        altura = tecla.nextBigDecimal();
    }

    public BigDecimal calcSuperficie() {
        return base.multiply(altura);
    }

    public BigDecimal calcPerimetro() {
        BigDecimal suma = base.add(altura);
        BigDecimal multip = suma.multiply(new BigDecimal(2));
        return multip;
    }

    public void dibujarRecta() {
        BigDecimal cero = BigDecimal.ZERO;
        for (BigDecimal i = BigDecimal.ZERO; i.compareTo(altura) < 0; i = i.add(BigDecimal.ONE)) {
            for (BigDecimal j = BigDecimal.ZERO; j.compareTo(base) < 0; j = j.add(BigDecimal.ONE)) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
