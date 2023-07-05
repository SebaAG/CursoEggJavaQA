package entidad;

public class Cafetera {
    private int capMaxima;
    private int cantActual;

    public Cafetera(){
        this.capMaxima = 1000;
        this.cantActual = 0;
    }

    public Cafetera(int capMaxima, int cantActual) {
        this.capMaxima = capMaxima;
        this.cantActual = cantActual;
    }

    public int getCapMaxima() {
        return capMaxima;
    }
    public int getCantActual() {
        return cantActual;
    }
    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }
    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
}
