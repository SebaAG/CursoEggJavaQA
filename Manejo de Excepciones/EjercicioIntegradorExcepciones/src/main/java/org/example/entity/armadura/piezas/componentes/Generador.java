package org.example.entity.armadura.piezas.componentes;

public class Generador {
    private final float energiaMax = 10000;
    private float energia;

    public Generador() {
        energia = 10000;
    }

    public Generador(float en){
        energia = en;
    }

    public float getEnergiaMax() {
        return energiaMax;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }
}
