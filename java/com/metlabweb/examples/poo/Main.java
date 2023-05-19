package com.metlabweb.examples.poo;

public class Main {
    public static void main(String[] args) {
        //Ejemplo sin objetos

        String nombrePokemon1 = "???";
        int ataquePokemon1 = 5;
        int defensaPokemon1 = 10;

        String nombrePokemon2 = "Chikorita";
        String tipoPokemon2 = "Planta";
        float temperaturaPreferidaPokemon2 = 29.5f;
        int ataquePokemon2 = 13;
        int defensaPokemon2 = 22;

        String nombrePokemon3 = "Hoothoot";
        String tipoPokemon3 = "Volador";
        int alturaDeVueloPokemon3 = 100;
        int ataquePokemon3 = 15;
        int defensaPokemon3 = 20;

        System.out.println("\n======= EJEMPLO SIN OBJETOS =======");

        System.out.println("\nHola, soy un pokemon misterioso "
                            + ". Mi nombre es " + nombrePokemon1
                            + ". Mis estadísticas son: Ataque = " + ataquePokemon1
                                                    + ", Defensa = " + defensaPokemon1
                                                    + ", TOTAL = " + (ataquePokemon1 + defensaPokemon1));

        System.out.println("\nHola, soy un pokemon de tipo " + tipoPokemon2
                            + ". Mi nombre es " + nombrePokemon2
                            + ". Mi temperatura preferida es " + temperaturaPreferidaPokemon2 + "º"
                            + ". Mis estadísticas son: Ataque = " + ataquePokemon2
                                                    + ", Defensa = " + defensaPokemon2
                                                    + ", TOTAL = " + (ataquePokemon2 + defensaPokemon2));

        System.out.println("\nHola, soy un pokemon de tipo " + tipoPokemon3
                            + ". Mi nombre es " + nombrePokemon3
                            + ". Mi altura de vuelo es " + alturaDeVueloPokemon3 + "km"
                            + ". Mis estadísticas son: Ataque = " + ataquePokemon3
                                                    + ", Defensa = " + defensaPokemon3
                                                    + ", TOTAL = " + (ataquePokemon3 + defensaPokemon3));

        //Ejemplo con objetos

        Pokemon pokemonDesconocido = new Pokemon("???", new Estadisticas(5,10)); //variable de tipo Pokemon (clase padre) + objeto de tipo Pokemon
        Volador hothot = new Volador("hothot", new Estadisticas(15,20), 100); //variable de tipo PokemonVolador (clase hija) + objeto de tipo PokemonVolador
        Pokemon chicorita = new Planta("chicorita", new Estadisticas(13,22), 29.5f); //variable de tipo Pokemon (clase padre) + objeto de tipo PokemonPlanta (clase hija)

        System.out.println("\n======= EJEMPLO CON OBJETOS =======");

        pokemonDesconocido.saludar();
        chicorita.saludar();
        hothot.saludar();

        hothot.setAlturaDeVuelo(250);
        chicorita.getEstadisticas().setAtaque(200);

        System.out.println("\n------- cambiamos algunos datos -------");

        chicorita.saludar();
        hothot.saludar();

    }
}
