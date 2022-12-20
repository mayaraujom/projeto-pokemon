package Jogador;
import java.util.ArrayList;

import Pokemons.Pokemon;

public class Jogador {
    private String nome, descricao, especialidade;
    private Integer nivel;
    private Integer NUM_POKEMONS = 3;
    private Integer idPokemonAtual = null;
    public ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
       
    public Integer getIdPokemonAtual() {
        return idPokemonAtual;
    }

    public void setIdPokemonAtual(Integer idPokemonAtual) {
        this.idPokemonAtual = idPokemonAtual;
    }

    public Integer getNUM_POKEMONS() {
        return this.NUM_POKEMONS;
    }    

    public void addPokemon(Pokemon pokemon) {        
        this.pokemons.add(pokemon);
    }

    protected void subirNivel () {
        this.nivel++;
    }

    protected void setNome (String nome) {
        this.nome = nome;        
    }

    public String getNome () {
        return this.nome;        
    }

    public Integer getTotalPokemonsVivos() {
        Integer totalPokemonsVivos = 0;
        for (int i=0;i<pokemons.size();i++) {;
            if (this.pokemons.get(i).getVida() > 0) {
                totalPokemonsVivos++;
            }
        }
        return totalPokemonsVivos;
    }
}