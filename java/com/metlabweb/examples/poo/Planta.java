package com.metlabweb.examples.poo;

public class Planta extends Pokemon {

    public final String TIPO = "Planta";
    public float temperaturaPreferida;

    public Planta(String nombre, Estadisticas estadisticas, float temperaturaPreferida) {
        super(nombre, estadisticas);
        this.temperaturaPreferida = temperaturaPreferida;
    }

    public float getTemperaturaPreferida() {
        return temperaturaPreferida;
    }

    public void setTemperaturaPreferida(float temperaturaPreferida) {
        this.temperaturaPreferida = temperaturaPreferida;
    }

    public String getTipo() {
        return TIPO;
    }

    @Override
    public void saludar() {
        System.out.println("\nHola, soy un Pokemon de tipo " + this.TIPO
                            + "! Mi nombre es: " + this.getNombre()
                            + ". Mi temperatUra preferida es: " + temperaturaPreferida + "º"
                            + ". Mis estadísticas son: " + super.getEstadisticas());
    }

}
