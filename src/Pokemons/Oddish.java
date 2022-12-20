package Pokemons;

import java.util.ArrayList;

public class Oddish extends Pokemon {

    public Oddish(Integer nivel) {

        ArrayList<Double> vidasEvolucoes = new ArrayList<Double>();
        ArrayList<ArrayList<Integer>> danosAtaques = new ArrayList<ArrayList<Integer>>();    
        ArrayList<Integer> danos = new ArrayList<Integer>();
        ArrayList<ArrayList<String>> nomesAtaques = new ArrayList<ArrayList<String>>();
        ArrayList<String> ataques = new ArrayList<String>();
        ArrayList<String> nomes = new ArrayList<String>();

        vidasEvolucoes.add(100.0);
        vidasEvolucoes.add(200.0);
        vidasEvolucoes.add(300.0);
        
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

        ataques.add("Acid");
        ataques.add("Razor Leaf");
        ataques.add("Seed Bomb");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Sludge Bomb");
        ataques.add("Moonblast");
        ataques.add("Acid");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Razor Leaf");
        ataques.add("Seed Bomb ");
        ataques.add("Sludge Bomb");

        nomesAtaques.add(ataques);

        nomes.add("Oddish");
        nomes.add("Gloom");
        nomes.add("Vileplume");
        
        this.setVidasEvolucoes(vidasEvolucoes);
        this.setDanosAtaquesEvolucoes(danosAtaques);
        this.setNomesAtaquesEvolucoes(nomesAtaques);
        this.setNomesEvolucoes(nomes);
        this.evoluir(nivel-1);
    }
}