package Pokemons;

import java.util.ArrayList;

public abstract class Pokemon {
    private Integer MAX_REVIVES = 1;
    private Integer revives;
    private String classe;
    private Integer nivel;
    private String nome;
    private Double vida;
    private Double vidaInicial;
    private ArrayList<String> nomesAtaques = new ArrayList<String>();
    private ArrayList<Integer> danosAtaques = new ArrayList<Integer>();

    private ArrayList<String> nomesEvolucoes = new ArrayList<String>();
    private ArrayList<Double> vidasEvolucoes = new ArrayList<Double>();
    private ArrayList<ArrayList<String>> nomesAtaquesEvolucoes = new ArrayList<ArrayList<String>>();
    private ArrayList<ArrayList<Integer>> danosAtaquesEvolucoes = new ArrayList<ArrayList<Integer>>();
    
    public Pokemon () {
        this.revives = this.MAX_REVIVES;
    }

    public void evoluir (Integer nivel) {
        ArrayList<String> nomesAtaques = new ArrayList<String>();        
        for (int i=0;i<nomesAtaquesEvolucoes.get(nivel).size()-1;i++) {
            nomesAtaques.add(nomesAtaquesEvolucoes.get(nivel).get(i));            
        }

        ArrayList<Integer> danosAtaques = new ArrayList<Integer>();        
        for (int i=0;i<danosAtaquesEvolucoes.get(nivel).size();i++) {
            danosAtaques.add(danosAtaquesEvolucoes.get(nivel).get(i));            
        }
        
        this.setNivel(nivel);        
        this.setNome(nomesEvolucoes.get(nivel));
        this.setVida(vidasEvolucoes.get(nivel));        

        this.setNomesAtaques(nomesAtaques);
        this.setDanosAtaques(danosAtaques);
    }

    /* Função que diminui a vida do Pokemon ao receber um ataque e informa se o Pokemon ainda está vivo. */
    public Boolean recebeAtaque(Double ataque) {        
        if (this.vida > ataque) {
            this.vida-=ataque;            
            return true;
        }
        else {
            this.vida = 0.0;            
            System.out.println("O Pokemon " + this.getNome() + " ficou sem vida!");
            return false;
        }
    }

    protected String getClasse() {
        return classe;
    }

    protected void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVida() {        
        return this.vida;        
    }

    protected void setVida(Double vida) {
        this.vida = vida;
        this.vidaInicial = vida;
    }

    public ArrayList<String> getNomesAtaques() {
        return nomesAtaques;
    }

    protected void setNomesAtaques(ArrayList<String> nomesAtaques) {
        this.nomesAtaques = nomesAtaques;
    }

    public ArrayList<Integer> getDanosAtaques() {
        return danosAtaques;
    }

    protected void setDanosAtaques(ArrayList<Integer> danosAtaques) {
        this.danosAtaques = danosAtaques;
    }

    public ArrayList<String> getNomesEvolucoes() {
        return nomesEvolucoes;
    }

    protected void setNomesEvolucoes(ArrayList<String> nomesEvolucoes) {
        this.nomesEvolucoes = nomesEvolucoes;
    }

    private ArrayList<Double> getVidasEvolucoes() {
        return vidasEvolucoes;
    }

    protected void setVidasEvolucoes(ArrayList<Double> vidasEvolucoes) {
        this.vidasEvolucoes = vidasEvolucoes;
    }

    private ArrayList<ArrayList<String>> getNomesAtaquesEvolucoes() {
        return nomesAtaquesEvolucoes;
    }

    protected void setNomesAtaquesEvolucoes(ArrayList<ArrayList<String>> nomesAtaquesEvolucoes) {
        this.nomesAtaquesEvolucoes = nomesAtaquesEvolucoes;
    }

    private ArrayList<ArrayList<Integer>> getDanosAtaquesEvolucoes() {
        return danosAtaquesEvolucoes;
    }

    protected void setDanosAtaquesEvolucoes(ArrayList<ArrayList<Integer>> danosAtaquesEvolucoes) {
        this.danosAtaquesEvolucoes = danosAtaquesEvolucoes;
    }

    public Integer getRevives() {
        return revives;
    }

    public void restauraRevives() {
        this.revives = this.MAX_REVIVES;
    }

    public void usarRevive() {
        this.revives--;
        this.vida = this.vidaInicial * 0.75;
    }

    public Integer getMAX_REVIVES() {
        return MAX_REVIVES;
    }

    public void mostrarRevive() {
        System.out.println("O seu Pokemon ainda pode reviver " + this.getRevives() + " veze(s). Revivendo automaticamente! Essa ação restaurará a vida em 75%.");
        this.usarRevive();
    }

}