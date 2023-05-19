package com.metlabweb.examples.poo;

public class Estadisticas {
    private int ataque;
    private int defensa;

    public Estadisticas(int ataque, int defensa) {
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int calcularTotal() {
        return ataque + defensa;
    }

    @Override
    public String toString() {
        return  "Ataque = " + ataque +
                ", Defensa = " + defensa +
                ", TOTAL = " + calcularTotal();
    }
}
