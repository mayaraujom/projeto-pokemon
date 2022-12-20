package Pokemons;

import java.util.ArrayList;

public class Squirtle extends Pokemon {

    public Squirtle(Integer nivel) {
        ArrayList<Double> vidasEvolucoes = new ArrayList<Double>();
        ArrayList<ArrayList<Integer>> danosAtaques = new ArrayList<ArrayList<Integer>>();    
        ArrayList<Integer> danos = new ArrayList<Integer>();
        ArrayList<ArrayList<String>> nomesAtaques = new ArrayList<ArrayList<String>>();
        ArrayList<String> ataques = new ArrayList<String>();
        ArrayList<String> nomes = new ArrayList<String>();

        vidasEvolucoes.add(150.0);
        vidasEvolucoes.add(250.0);
        vidasEvolucoes.add(350.0);        
        
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
        ataques.add("Bubble");
        ataques.add("Aqua Jet");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Water Pulse ");
        ataques.add("Aqua Tail");
        ataques.add("Tackle ");

        nomesAtaques.add(ataques);

        ataques.clear();
        
        ataques.add("Bubble");
        ataques.add("Aqua Jet ");
        ataques.add("Water Pulse");

        nomesAtaques.add(ataques);

        nomes.add("Squirtle");
        nomes.add("Wartortle");
        nomes.add("Blastoise");     
        
        this.setVidasEvolucoes(vidasEvolucoes);
        this.setDanosAtaquesEvolucoes(danosAtaques);
        this.setNomesAtaquesEvolucoes(nomesAtaques);
        this.setNomesEvolucoes(nomes);
        this.evoluir(nivel-1);
    }    
}
