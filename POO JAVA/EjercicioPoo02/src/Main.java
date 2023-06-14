public class Main {
    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(5.5);
        circunferencia.setRadio(4.2);
        double radio = circunferencia.getRadio();
        System.out.println("Radio de la circunferencia: " + radio);

        circunferencia.crearCircunferencia();

        double area = circunferencia.area();
        System.out.println("Area de la circunferencia: " + area);

        double perimetro = circunferencia.perimetro();
        System.out.println("Perimetro de la circunferencia: " + perimetro);

    }
}