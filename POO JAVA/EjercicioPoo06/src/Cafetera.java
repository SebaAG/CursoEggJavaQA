public class Cafetera {
    private int capMaxima;
    private int cantActual;

    public Cafetera(){
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

    public void llenarCafetera() {
        cantActual = capMaxima;
    }

    public void servirCafe(int taza) {
        if (cantActual >= taza) {
            cantActual -= taza;
            System.out.println("Se lleno la taza");
        } else {
            int cafeServido = cantActual;
            cantActual = 0;
            System.out.println("No se puede servir el cafe, tiene todavia " + cafeServido + " unidades de cafe!");
        }
    }

    public void vaciarCafetera(){
        cantActual = 0;
    }

    public void agregarCafe(int cantidad) {
        cantActual += cantidad;
        if (cantActual > capMaxima) {
            cantActual = capMaxima;
        }
    }
}
