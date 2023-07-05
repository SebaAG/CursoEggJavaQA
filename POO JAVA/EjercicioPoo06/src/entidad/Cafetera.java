package entidad;

public class Cafetera {
    private final int capMaxima;
    private int cantActual;

    public Cafetera(){
        this.capMaxima = 1000;
        this.cantActual = 0;
    }

    public int getCapMaxima() {
        return capMaxima;
    }
    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
}
