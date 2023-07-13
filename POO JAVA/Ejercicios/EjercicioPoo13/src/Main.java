import service.CursoService;

public class Main {
    public static void main(String[] args) {
        CursoService cursoService = new CursoService();
        cursoService.crearCurso();

        System.out.println("Ganancia semanal: " + cursoService.calcularGananciaSemanal());
    }
}