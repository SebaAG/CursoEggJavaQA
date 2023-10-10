package org.example.entity;

import org.example.interfaces.Gimnasio;

public class GimnasioTipoB implements Gimnasio {
    @Override
    public boolean esTipoA() {
        return false;
    }
}
