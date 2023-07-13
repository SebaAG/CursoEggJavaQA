import service.PersonaProcesService;

public class Main {
    public static void main(String[] args) {
        PersonaProcesService service = new PersonaProcesService();
        service.crearPersonas();

        double porcPesoIdeal = service.porcentajePesoIdeal();
        double porcBajoPeso = service.porcentajeBajoPeso();
        double porcSobrepeso = service.porcentajeSobrepeso();
        double porcMayorEdad = service.porcentajeMayorEdad();
        double porcMenorEdad = service.porcentajeMenorEdad();

        System.out.println("Porcentaje de personas con peso ideal: " + porcPesoIdeal + "%");
        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcBajoPeso + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcSobrepeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcMayorEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcMenorEdad + "%");
    }
}