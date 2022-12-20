package Pokemons;

import java.util.ArrayList;

public class Weedle extends Pokemon {

    public Weedle(Integer nivel) {

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

        ataques.add("Bug Bite");
        ataques.add("Poison Sting");
        ataques.add("Struggle");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Bug Bite");
        ataques.add("Poison Sting");
        ataques.add("Struggle");

        nomesAtaques.add(ataques);

        ataques.clear();

        ataques.add("Bug Bite");
        ataques.add("Poison Sting");
        ataques.add("Struggle");

        nomesAtaques.add(ataques);

        nomes.add("Weedle");
        nomes.add("Kakuna");
        nomes.add("Beedrill");
        
        this.setVidasEvolucoes(vidasEvolucoes);
        this.setDanosAtaquesEvolucoes(danosAtaques);
        this.setNomesAtaquesEvolucoes(nomesAtaques);
        this.setNomesEvolucoes(nomes);
        this.evoluir(nivel-1);
    }
}