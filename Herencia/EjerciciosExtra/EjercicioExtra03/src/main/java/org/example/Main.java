package org.example;

import org.example.entity.*;
import org.example.interfaces.Alojamiento;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de alojamientos
        HotelCuatroEstrellas hotel1 = new HotelCuatroEstrellas("Hotel Nestor Kirchner", "ALgun lado del Conurbano", "Buenos Aires", "Mauricio Macri",
                100, 200, 5, true, "El buen Khori", 40, 3);
        HotelCincoEstrellas hotel2 = new HotelCincoEstrellas("Hotel Una Massa", "Al lado del NestorK", "Buenos Aires", "Javier Milei",
                150, 300, 7, true, "Pastas de Massa", 60, 5, 10, 2);
        Camping camping1 = new Camping("Retiro La Campora", "Calle Falsa 123", "Zambia", "Juan Grabois",
                false, 5000, 0, 50, 2, true);
        Residencia residencia1 = new Residencia("Las Bombas", "Av. Libertad 345", "CABA", "Carolina Serrano",
                true, 8000, 2, 30, true, true);

        // Crear un sistema de alojamientos
        SistemaAlojamientos sistemaAlojamientos = new SistemaAlojamientos();

        // Agregar los alojamientos al sistema
        sistemaAlojamientos.agregarAlojamiento(hotel1);
        sistemaAlojamientos.agregarAlojamiento(hotel2);
        sistemaAlojamientos.agregarAlojamiento(camping1);
        sistemaAlojamientos.agregarAlojamiento(residencia1);

        // Consulta: Todos los alojamientos
        System.out.println("Todos los alojamientos:");
        List<Alojamiento> todosLosAlojamientos = sistemaAlojamientos.obtenerTodosLosAlojamientos();
        for (Alojamiento alojamiento : todosLosAlojamientos) {
            System.out.println(alojamiento.getNombre());
        }

        // Consulta: Hoteles de más caro a más barato
        System.out.println("\nHoteles de más caro a más barato:");
        List<Hotel> hotelesOrdenados = sistemaAlojamientos.obtenerHotelesDeMasCaroAMasBarato();
        for (Hotel hotel : hotelesOrdenados) {
            System.out.println(hotel.getNombre() + " - Precio por habitación: $" + hotel.calcularPrecioHabitacion());
        }

        // Consulta: Campings con restaurante
        System.out.println("\nCampings con restaurante:");
        List<Camping> campingsConRestaurante = sistemaAlojamientos.obtenerCampingsConRestaurante();
        for (Camping camping : campingsConRestaurante) {
            System.out.println(camping.getNombre());
        }

        // Consulta: Residencias con descuento
        System.out.println("\nResidencias con descuento:");
        List<Residencia> residenciasConDescuento = sistemaAlojamientos.obtenerResidenciasConDescuento();
        for (Residencia residencia : residenciasConDescuento) {
            System.out.println(residencia.getNombre());
        }
    }
}
