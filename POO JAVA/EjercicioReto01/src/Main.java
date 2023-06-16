public class Main {
    public static void main(String[] args) {

        Vehiculo auto = new Vehiculo("Ford", "KA", 2008, "automovil");
        Vehiculo moto = new Vehiculo("Honda", "CBR", 1998, "motocicleta");
        Vehiculo bici = new Vehiculo("No", "Conozco", 1452, "bicicleta");

        auto.moverse(5);
        auto.moverse(10);
        auto.moverse(60);

        moto.moverse(5);
        moto.moverse(10);
        moto.moverse(60);

        bici.moverse(5);
        bici.moverse(10);
        bici.moverse(60);

        auto.frenar();
        moto.frenar();
        bici.frenar();

        int tiempo = 300;
        double distanciaAuto = auto.calcularDistanciaRecorrida(tiempo);
        double distanciaMoto = moto.calcularDistanciaRecorrida(tiempo);
        double distanciaBici = bici.calcularDistanciaRecorrida(tiempo);
        
        String vehiculoLejos;
        double distanciaLejos;

        if (distanciaAuto > distanciaMoto && distanciaAuto > distanciaBici) {
            vehiculoLejos = "Ford KA";
            distanciaLejos = distanciaAuto;
        } else if (distanciaMoto > distanciaBici) {
            vehiculoLejos = "Honda CBR";
            distanciaLejos = distanciaMoto;
        } else {
            vehiculoLejos = "Bicicleta No Conozco";
            distanciaLejos = distanciaBici;
        }

        System.out.println("El vehículo que llego mas lejos despues de frenar es: " + vehiculoLejos);
        System.out.println("Distancia recorrida: " + distanciaLejos + " metros.");
    }
}