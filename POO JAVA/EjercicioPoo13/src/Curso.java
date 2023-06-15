import java.util.Scanner;

public class Curso {
    Scanner tecla = new Scanner(System.in);
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso(){
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana,
                 String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso(){
        return nombreCurso;
    }
    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }
    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }
    public String getTurno() {
        return turno;
    }
    public double getPrecioPorHora() {
        return precioPorHora;
    }
    public String[] getAlumnos() {
        return alumnos;
    }
    public void  setNombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }
    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {
        alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": " );
            alumnos[i] = tecla.nextLine();
        }
    }

    public void crearCurso() {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Ingresar nombre del curso: ");
        nombreCurso = tecla.nextLine();
        System.out.print("Ingresar la cantidad de horas por dia: ");
        cantidadHorasPorDia = tecla.nextInt();
        System.out.print("Ingresar la cantidad de dias por semana: ");
        cantidadDiasPorSemana = tecla.nextInt();
        tecla.nextLine();
        System.out.print("Ingresar el turno (mañana/tarde): ");
        turno = tecla.nextLine();
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = tecla.nextDouble();

        cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        return cantidadHorasPorDia * precioPorHora * alumnos.length * cantidadDiasPorSemana;
    }
}