package entidad;

import java.math.BigDecimal;

public class Rectangulo {
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
}