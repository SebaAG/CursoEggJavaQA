import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public Date getNacimiento() {
        return nacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void crearPersona() {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Ingresar nombre: ");
        nombre = tecla.nextLine();
        System.out.println("Ingresar fecha de nacimiento (d/m/a): ");
        String fecha = tecla.nextLine();
        nacimiento = fechaDate(fecha);

        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public int calcularEdad() {
        Date fechaHoy = new Date();
        long difer = fechaHoy.getTime() - nacimiento.getTime();
        int edad = (int) (difer / (1000L * 60 * 60 * 24 * 365));
        return edad;
    }

    public boolean menorQue(int edad) {
        int edadActual = calcularEdad();
        return edadActual < edad;
    }

    public void mostrarPersona() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormat = sdf.format(nacimiento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaFormat);
        System.out.println("Edad: " + calcularEdad());
    }

    private Date fechaDate(String fecha) {
        String[] part = fecha.split("/");
        int dia = Integer.parseInt(part[0]);
        int mes = Integer.parseInt(part[1]) - 1;
        int anno = Integer.parseInt(part[2]) - 1900;
        return new Date(anno, mes, dia);
    }
}