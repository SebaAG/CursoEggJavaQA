public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        persona1.crearPersona();
        persona2.crearPersona();
        persona3.crearPersona();
        persona4.crearPersona();

        int imcPersona1 = persona1.calcularIMC();
        int imcPersona2 = persona2.calcularIMC();
        int imcPersona3 = persona3.calcularIMC();
        int imcPersona4 = persona4.calcularIMC();

        boolean esMayorP1 = persona1.esMayor();
        boolean esMayorP2 = persona2.esMayor();
        boolean esMayorP3 = persona3.esMayor();
        boolean esMayorP4 = persona4.esMayor();

        double porcPesoIdeal = calcPorc(imcPersona1, imcPersona2, imcPersona3, imcPersona4, 0);
        double porcBajoPe = calcPorc(imcPersona1, imcPersona2, imcPersona3, imcPersona4, -1);
        double porcSobrepe = calcPorc(imcPersona1, imcPersona2, imcPersona3, imcPersona4, 1);

        double porcMayorEdad = calcPorc(esMayorP1, esMayorP2, esMayorP3, esMayorP4, true);
        double porcjeMenorEdad = calcPorc(esMayorP1, esMayorP2, esMayorP3, esMayorP4, false);

        System.out.println("Porcentaje de personas con peso ideal: " + porcPesoIdeal + "%");
        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcBajoPe + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcSobrepe + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcMayorEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcjeMenorEdad + "%");
    }

    public static double calcPorc(int valor1, int valor2, int valor3, int valor4, int obj) {
        int cantObj = 0;
        if (valor1 == obj) {
            cantObj++;
        }
        if (valor2 == obj) {
            cantObj++;
        }
        if (valor3 == obj) {
            cantObj++;
        }
        if (valor4 == obj) {
            cantObj++;
        }
        return (cantObj / 4.0) * 100;
    }

    public static double calcPorc(boolean valor1, boolean valor2, boolean valor3, boolean valor4, boolean obj) {
        int cantObj = 0;
        if (valor1 == obj) {
            cantObj++;
        }
        if (valor2 == obj) {
            cantObj++;
        }
        if (valor3 == obj) {
            cantObj++;
        }
        if (valor4 == obj) {
            cantObj++;
        }
        return (cantObj / 4.0) * 100;
    }
}