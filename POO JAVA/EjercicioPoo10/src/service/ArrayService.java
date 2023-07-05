package service;

import entidad.Array;

import java.util.Arrays;

public class ArrayService {
    /**
     * Carga un array con valores aleatorios y realiza operaciones sobre él.
     */
    public void cargarArray() {
        Array array = new Array();
        double[] A = new double[50];

        // Genera valores aleatorios y los asigna al primer vector
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 50);
        }
        array.setVector1(A);

        // SETEO LOS VALORES DEL SEGUNDO ARRAY BASÁNDONOS EN EL PRIMERO
        // Copia los primeros 10 elementos del vector1 al vector2
        array.setVector2(Arrays.copyOf(array.getVector1(), 20));

        // Rellena los elementos del vector2 desde la posición 10 hasta la posición 20 (sin cambios) con el valor 0.5
        Arrays.fill(array.getVector2(), 10, 20, 0.5);

        // MUESTRO LOS VALORES
        System.out.println(array);

        // LOS ORDENO E IMPRIMO USANDO FUNCIONES PROPIAS DE JAVA
        // Ordena el vector1 de forma ascendente
        Arrays.sort(array.getVector1());
        System.out.println("El vector 1 ordenado es: ");
        System.out.println(Arrays.toString(array.getVector1()));

        // Ordena el vector2 de forma ascendente
        Arrays.sort(array.getVector2());
        System.out.println("El vector 2 ordenado es: ");
        System.out.println(Arrays.toString(array.getVector2()));
    }
}