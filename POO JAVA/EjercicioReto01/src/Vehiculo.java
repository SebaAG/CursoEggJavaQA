class Vehiculo {
    private String marca;
    private String modelo;
    private int anno;
    private String tipo;
    private int veloc;

    public Vehiculo(String marca, String modelo, int anno, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.tipo = tipo;

        if (tipo.equalsIgnoreCase("automovil")) {
            this.veloc = 3;
        } else if (tipo.equalsIgnoreCase("motocicleta")) {
            this.veloc = 2;
        } else if (tipo.equalsIgnoreCase("bicicleta")) {
            this.veloc = 1;
        } else {
            System.out.println("NONO.");
        }
    }

    public void moverse(int tiempo) {
        double distancia = veloc * tiempo;
        System.out.println("El vehiculo " + marca + " " + modelo + " se movio " + distancia + " metros en " +
                tiempo + " segundos");
    }

    public void frenar() {
        if (tipo.equalsIgnoreCase("bicicleta")) {
            System.out.println("La bicicleta " + marca + " " + modelo + " se freno y no avanzo mas");
        } else {
            double distanciaFrenado = veloc * 2;
            System.out.println("El vehiculo " + marca + " " + modelo + " se freno y no avanzo mas " +
                    distanciaFrenado + " metros antes de detenerse.");
        }
    }

    public double calcularDistanciaRecorrida(int tiempo) {
        return veloc * tiempo;
    }
}
