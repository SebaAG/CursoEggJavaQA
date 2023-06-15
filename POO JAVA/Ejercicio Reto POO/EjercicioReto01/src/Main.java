public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo("Nissan", "Skyline", 2002, "automovil");
        Vehiculo moto = new Vehiculo("Honda", "Cbr", 2010, "motocicleta");
        Vehiculo bici = new Vehiculo("Nose", "Nidea", 1650, "bicicleta");

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
    }
}