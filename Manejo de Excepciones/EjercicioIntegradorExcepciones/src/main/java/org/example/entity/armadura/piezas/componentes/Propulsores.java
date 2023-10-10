package org.example.entity.armadura.piezas.componentes;

import java.util.Random;

public class Propulsores extends Componente{
    private float consumo;

    public Propulsores() {
        super();
        consumo = 15f;
    }

    public Propulsores(int consumo){
        this.consumo = consumo;
    }

    public float usar(int intensidad, float tiempo){
        return (consumo * tiempo) * intensidad;
    }

    public boolean impacto(){
        int danio = new Random().nextInt(100)+1;

        if(danio == 100){
            super.destruido = true;
            System.out.println("El propulsor fue destruido!!");
            return true;
        }else if (danio >= 50){
            super.averiado = true;
            System.out.println("El propulsor fue dañado!!");
            return true;
        } else {
            return false;
        }
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
}
