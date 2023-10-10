package org.example.entity.armadura.piezas.componentes;

public abstract class Componente {
    protected boolean averiado;
    protected boolean destruido;

    public Componente(){
        averiado = false;
        destruido = false;
    }

    public Componente(boolean averiado, boolean destruido) {
        this.averiado = averiado;
        this.destruido = destruido;
    }

    public boolean isAveriado() {
        return averiado;
    }

    public void setAveriado(boolean averiado) {
        this.averiado = averiado;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }
}
