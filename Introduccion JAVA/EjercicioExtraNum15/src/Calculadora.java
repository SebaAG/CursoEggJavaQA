import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = teclado.nextInt();

        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("Ingrese que operacion desea realizar:");
        int menu = teclado.nextInt();
        int result = 0;

        switch (menu) {
            case 1:
                result = sumar(num1,num2);
                break;
            case 2:
                result = restar(num1,num2);
                break;
            case 3:
                result = multi(num1,num2);
                break;
            case 4:
                result = div(num1,num2);
                break;
            default:
                System.out.println("Ingresaste una opcion incorrecta");
        }
        System.out.println("Resultado: " + result);

   }
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
    public static int restar(int num1, int num2) {
        return num1 - num2;
    }
    public static int multi(int num1, int num2) {
        return num1 * num2;
    }
    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}