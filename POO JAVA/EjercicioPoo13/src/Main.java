public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.crearCurso();

        System.out.println("Ganancia semanal del curso: " + curso.calcularGananciaSemanal() + " $");
    }
}