package com.metlabweb.examples.poo;

public class Pokemon {

    private String nombre;
    private Estadisticas estadisticas;

    public Pokemon(String nombre, Estadisticas estadisticas) {
        this.nombre = nombre;
        this.estadisticas = estadisticas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    public void saludar() {
        System.out.println("\nHola, soy un Pokemon misterioso! Mi nombre es: " + this.nombre
                            + ". Mis estadísticas son: " + this.getEstadisticas());
    }

}
