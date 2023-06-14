// Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
//
//49
//C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
public class ValorDiferente {
    public static void main(String[] args) {
        int aux;
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;

        System.out.println("Valores iniciales:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);

        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;

        System.out.println("Valores finales:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);

        }
    }
