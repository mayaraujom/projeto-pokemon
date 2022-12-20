package Pokemons;

import java.util.ArrayList;

public class Bulbasaur extends Pokemon {

    public Bulbasaur(Integer nivel) {

        ArrayList<Double> vidasEvolucoes = new ArrayList<Double>();
        ArrayList<ArrayList<Integer>> danosAtaques = new ArrayList<ArrayList<Integer>>();    
        ArrayList<Integer> danos = new ArrayList<Integer>();
        ArrayList<ArrayList<String>> nomesAtaques = new ArrayList<ArrayList<String>>();
        ArrayList<String> ataques = new ArrayList<String>();
        ArrayList<String> nomes = new ArrayList<String>();

        vidasEvolucoes.add(300.0);
        vidasEvolucoes.add(400.0);
        vidasEvolucoes.add(500.0);
        
        danos.add(30);
        danos.add(40);
        danos.add(50);

        danosAtaques.add(danos);

        danos.clear();

        danos.add(50);
        danos.add(60);
        danos.add(70);

        danosAtaques.add(danos);

        danos.clear();

        danos.add(50);
        danos.add(60);
        danos.add(70);

        danosAtaques.add(danos);

        ataques.add("Tackle");
        ataques.add("Growl");
        ataques.add("Leech Seed");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Vine Whip");
        ataques.add("Poison Powder");
        ataques.add("Sleep Powder");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Take Down");
        ataques.add("Razor Lead");
        ataques.add("Sweet Scent");

        nomesAtaques.add(ataques);

        nomes.add("Bulbasaur");
        nomes.add("Ivysaur");
        nomes.add("Venusaur");
        
        this.setVidasEvolucoes(vidasEvolucoes);
        this.setDanosAtaquesEvolucoes(danosAtaques);
        this.setNomesAtaquesEvolucoes(nomesAtaques);
        this.setNomesEvolucoes(nomes);
        this.evoluir(nivel-1);
    }
}