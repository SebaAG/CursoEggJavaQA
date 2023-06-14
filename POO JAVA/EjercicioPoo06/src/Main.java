public class Main {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(1000, 500);

        cafetera.llenarCafetera();
        cafetera.servirCafe(200);
        cafetera.servirCafe(700);
        cafetera.agregarCafe(300);
        cafetera.servirCafe(500);
        cafetera.vaciarCafetera();
        System.out.println("Cantidad actual de cafe en la cafetera: " + cafetera.getCantActual());
    }
}