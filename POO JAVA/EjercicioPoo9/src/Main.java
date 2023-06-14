import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Matematica matem = new Matematica();
        Random random = new Random();
        double num1 = random.nextDouble() * 10;
        double num2 = random.nextDouble() * 10;
        matem.setNum1(num1);
        matem.setNum2(num2);
        System.out.println("Numero 1: " + matem.getNum1());
        System.out.println("Numero 2: " + matem.getNum2());

        double may = matem.devolverMayor();
        System.out.println("El numero mayor es: " + may);
        double pot = matem.calcularPotencia();
        System.out.println("La potencia del numero mayor elevado al numero menor es: " + pot);
        double raiz = matem.calcularRaiz();
        System.out.println("La raiz cuadrada del numero menor (valor absoluto) es: " + raiz);
    }
}