package servicio;

import entidad.Puntos;

import java.util.Scanner;

public class PuntosService {
    Puntos puntos = new Puntos();
    public void crearPuntos() {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingresar coordenada X del primer punto: ");
        int x1 = tecla.nextInt();
        System.out.println("Ingresar coordenada X del segundo punto: ");
        int x2 = tecla.nextInt();
        System.out.println("Ingresar coordenada Y del primer punto: ");
        int y1 = tecla.nextInt();
        System.out.println("Ingresar coordenada Y del segundo punto: ");
        int y2 = tecla.nextInt();

        puntos.setX1(x1);
        puntos.setX2(x2);
        puntos.setY1(y1);
        puntos.setY2(y2);
    }

    public double calcularDistanciaX() {
        return Math.abs(puntos.getX2() - puntos.getX1());
    }

    public double calcularDistanciaY() {
        return Math.abs(puntos.getY2() - puntos.getY1());
    }


    public String toString() {
        return "Puntos{" +
                "x1=" +  puntos.getX1() +
                ", x2=" + puntos.getX2() +
                ", y1=" + puntos.getY1() +
                ", y2=" + puntos.getY2() +
                ", distancia entre puntos x = " + calcularDistanciaX() +
                ", distancia entre puntos y = " + calcularDistanciaY() +
                '}';
    }
}