package Pokemons;

import java.util.ArrayList;

public class Poliwag extends Pokemon {

    public Poliwag(Integer nivel) {

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

        ataques.add("Mud Shot");
        ataques.add("Bubble ");
        ataques.add("Bubble Beam");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Mud Bomb");
        ataques.add("Body Slam");
        ataques.add("Mud Shot");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Bubble");
        ataques.add("Bubble Beam");
        ataques.add("Mud Bomb ");

        nomesAtaques.add(ataques);

        nomes.add("Poliwag");
        nomes.add("Poliwhirl");
        nomes.add("Poliwrath");
        
        this.setVidasEvolucoes(vidasEvolucoes);
        this.setDanosAtaquesEvolucoes(danosAtaques);
        this.setNomesAtaquesEvolucoes(nomesAtaques);
        this.setNomesEvolucoes(nomes);
        this.evoluir(nivel-1);
    }
}