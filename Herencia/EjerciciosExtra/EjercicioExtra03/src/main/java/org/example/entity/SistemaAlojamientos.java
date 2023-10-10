package org.example.entity;

import org.example.interfaces.Alojamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaAlojamientos {
    private List<Alojamiento> alojamientos;

    public SistemaAlojamientos() {
        alojamientos = new ArrayList<>();
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        alojamientos.add(alojamiento);
    }

    public List<Alojamiento> obtenerTodosLosAlojamientos() {
        return Collections.unmodifiableList(alojamientos);
    }

    public List<Hotel> obtenerHotelesDeMasCaroAMasBarato() {
        List<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        Collections.sort(hoteles, (h1, h2) -> Double.compare(h2.calcularPrecioHabitacion(), h1.calcularPrecioHabitacion()));
        return hoteles;
    }

    public List<Camping> obtenerCampingsConRestaurante() {
        List<Camping> campingsConRestaurante = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.tieneRestaurante()) {
                    campingsConRestaurante.add(camping);
                }
            }
        }
        return campingsConRestaurante;
    }

    public List<Residencia> obtenerResidenciasConDescuento() {
        List<Residencia> residenciasConDescuento = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.tieneDescuentoGremios()) {
                    residenciasConDescuento.add(residencia);
                }
            }
        }
        return residenciasConDescuento;
    }
}

