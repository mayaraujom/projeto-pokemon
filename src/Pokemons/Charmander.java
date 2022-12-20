package Pokemons;

import java.util.ArrayList;

public class Charmander extends Pokemon {

    public Charmander(Integer nivel) {
        ArrayList<Double> vidasEvolucoes = new ArrayList<Double>();
        ArrayList<ArrayList<Integer>> danosAtaques = new ArrayList<ArrayList<Integer>>();    
        ArrayList<Integer> danos = new ArrayList<Integer>();
        ArrayList<ArrayList<String>> nomesAtaques = new ArrayList<ArrayList<String>>();
        ArrayList<String> ataques = new ArrayList<String>();
        ArrayList<String> nomes = new ArrayList<String>();

        vidasEvolucoes.add(350.0);
        vidasEvolucoes.add(450.0);
        vidasEvolucoes.add(550.0);
        
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

        ataques.add("Slash");
        ataques.add("Flamethrower");
        ataques.add("Flare Blitz");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Fire Spin");
        ataques.add("Air Slash");
        ataques.add("Heat Wave");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Wing Attack");
        ataques.add("Dragon Claw");
        ataques.add("Shadow Claw");

        nomesAtaques.add(ataques);

        nomes.add("Charmander");
        nomes.add("Charmeleon");
        nomes.add("Charizard");
        
        this.setVidasEvolucoes(vidasEvolucoes);
        this.setDanosAtaquesEvolucoes(danosAtaques);
        this.setNomesAtaquesEvolucoes(nomesAtaques);
        this.setNomesEvolucoes(nomes);
        this.evoluir(nivel-1);
    }    
}
