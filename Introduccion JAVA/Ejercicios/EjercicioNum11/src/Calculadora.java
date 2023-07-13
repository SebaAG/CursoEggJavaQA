import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer numero:");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese segundo numero:");
        int num2 = teclado.nextInt();
        int menu = 0;

        while (menu != 5){
            System.out.println("Seleccione lo que quiera realizar:");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            menu = teclado.nextInt();
            teclado.nextLine();

            switch (menu) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("La multiplicacion es: " + multi);
                    break;
                case 4:
                    if (num2 != 0) {
                        int div = num1 / num2;
                        System.out.println("La division es: " + div);
                    } else {
                        System.out.print("Imposible dividir entre 0.");
                    }
                    break;
                case 5:
                    String respuesta;
                    do {
                        System.out.println("Seguro que desea salir? (S/N)");
                        respuesta = teclado.nextLine().toUpperCase();
                        if (respuesta.equals("S")) {
                            System.out.println("Adios!!");
                            break;
                        } else if (respuesta.equals("N")) {
                            menu = 0;
                        } else {
                            System.out.println("Opcion ingresada incorrecta, seleccione S o N.");
                        }
                    } while (!respuesta.equals("S") && !respuesta.equals("N"));
                    break;
                default:
                    System.out.println("Opcion incorrecta, seleccione nuevamente.");
                    return;
            }
        }
    }
}