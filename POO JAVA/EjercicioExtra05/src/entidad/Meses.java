package entidad;

public class Meses {
    private final String[] mes;
    private final String mesSecreto;

    public Meses() {
        this.mes = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        this.mesSecreto = generarMesSecreto();
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    private String generarMesSecreto() {
        return mes[(int) (Math.random() * 12)];
    }
}
