package entidad;

public class Ahorcado {

    private String[] palabraSecreta;
    private String[] palabraOculta;
    private int jugadaMaxima;
    private int letrasEncontradas;
    private int intentosFallidos;

    public Ahorcado() {
    }
    public Ahorcado(String[] palabraSecreta, String[] palabraOculta, int jugadaMaxima, int letrasEncontradas) {
        this.palabraSecreta = palabraSecreta;
        this.palabraOculta = palabraOculta;
        this.jugadaMaxima = jugadaMaxima;
        this.letrasEncontradas = letrasEncontradas;

    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }
    public void setPalabraOculta(String[] palabraOculta) {
        this.palabraOculta = palabraOculta;
    }
    public void setJugadaMaxima(int jugadaMaxima) {
        this.jugadaMaxima = jugadaMaxima;
    }
    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }
    public String[] getPalabraOculta() {
        return palabraOculta;
    }
    public int getJugadaMaxima() {
        return jugadaMaxima;
    }
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }
}
