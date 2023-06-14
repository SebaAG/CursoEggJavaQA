import java.util.Scanner;

public class Persona {
    Scanner tecla = new Scanner(System.in);
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(){
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public char getSexo() {
        return sexo;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        System.out.println("Ingrese nombre: ");
        nombre = tecla.nextLine();
        System.out.println("Ingrese edad: ");
        edad = tecla.nextInt();
        System.out.println("Ingrese el sexo (H/M/O): ");
        sexo = tecla.next().charAt(0);

        while (Character.toLowerCase(sexo) != 'h' && Character.toLowerCase(sexo) != 'm'
                && Character.toLowerCase(sexo) != 'o') {
            System.out.print("Sexo incorrecto, ingrese nuevamente (H/M/O): ");
            sexo = Character.toLowerCase(tecla.next().charAt(0));
        }

        System.out.println("Ingrese el peso: ");
        peso = tecla.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = tecla.nextDouble();
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayor() {
        return edad >= 18;
    }
}
