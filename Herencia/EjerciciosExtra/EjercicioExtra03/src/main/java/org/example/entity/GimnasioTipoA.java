package org.example.entity;

import org.example.interfaces.Gimnasio;

public class GimnasioTipoA implements Gimnasio {
    @Override
    public boolean esTipoA() {
        return true;
    }
}
