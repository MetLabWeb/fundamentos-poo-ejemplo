package com.metlabweb.examples.poo;

public class Volador extends Pokemon {

    public final String TIPO = "Volador";
    public int alturaDeVuelo;

    public Volador(String nombre, Estadisticas estadisticas, int alturaDeVuelo) {
        super(nombre, estadisticas);
        this.alturaDeVuelo = alturaDeVuelo;
    }

    public int getAlturaDeVuelo() {
        return alturaDeVuelo;
    }

    public void setAlturaDeVuelo(int alturaDeVuelo) {
        this.alturaDeVuelo = alturaDeVuelo;
    }

    public String getTipo() {
        return TIPO;
    }

    @Override
    public void saludar() {
        System.out.println("\nHola, soy un Pokemon de tipo " + this.TIPO
                            + "! Mi nombre es: " + this.getNombre()
                            + ". Mi altura máxima de vuelo es: " + alturaDeVuelo + "km"
                            + ". Mis estadísticas son: " + super.getEstadisticas());
    }

}
