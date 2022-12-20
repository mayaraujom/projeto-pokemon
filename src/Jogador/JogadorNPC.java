package Jogador;

import java.util.ArrayList;
import java.util.Random;

import Pokemons.Caterpie;
import Pokemons.Nidoran;
import Pokemons.Oddish;
import Pokemons.Pidgey;
import Pokemons.Pokemon;
import Pokemons.Poliwag;
import Pokemons.Weedle;

public class JogadorNPC extends Jogador {
    private String especialidade;    

    public JogadorNPC() {
        ArrayList<String> listaEspecialidades = new ArrayList<String>();
        ArrayList<String> listaNomes = new ArrayList<String>();
        Boolean encontrou = false;
        Integer numero = 0;
        ArrayList<Integer> codigosPokemons = new ArrayList<Integer>();
        Random random = new Random();    

        ArrayList<Pokemon> pokemonsDisponiveis = new ArrayList<Pokemon>();

        Caterpie caterpie = new Caterpie(1);
        pokemonsDisponiveis.add(caterpie);

        Nidoran nidoran = new Nidoran(1);
        pokemonsDisponiveis.add(nidoran);

        Oddish oddish = new Oddish(1);
        pokemonsDisponiveis.add(oddish);

        Pidgey pidgey = new Pidgey(1);
        pokemonsDisponiveis.add(pidgey);
        
        Poliwag poliwag = new Poliwag(1);
        pokemonsDisponiveis.add(poliwag);

        Weedle weedle = new Weedle(1);
        pokemonsDisponiveis.add(weedle); 
                
        listaEspecialidades.add("Água");
        listaEspecialidades.add("Elétrico");
        listaEspecialidades.add("Gelo");
        listaEspecialidades.add("Luz");
        listaEspecialidades.add("Psíquico");

        listaNomes.add("Misty Williams");
        listaNomes.add("Brock Harrison");
        listaNomes.add("Tracey Sketchit");        
        listaNomes.add("Max");
        listaNomes.add("Dawn");
        listaNomes.add("Íris");
        listaNomes.add("Serena");
        listaNomes.add("Clemont");
        listaNomes.add("Gary Carvalho ");
        listaNomes.add("Ritchie");
        listaNomes.add("Vicent");
        listaNomes.add("Harrison");
        listaNomes.add("Morrison");
        listaNomes.add("Tyson");
        listaNomes.add("Paul");
        listaNomes.add("Barry");
        listaNomes.add("Conway");
        listaNomes.add("Stephan");
        
        /* Obtém um nome aleatório para o NPC */
        this.setNome(listaNomes.get(random.nextInt(listaNomes.size())));
        this.setEspecialidade(listaEspecialidades.get(random.nextInt(listaEspecialidades.size())));
        /* Sorteia 3 Pokemons diferentes */        
        for (int i=0;i<this.getNUM_POKEMONS();i++) { 
            encontrou = false;           
            while (!encontrou) {
                numero = random.nextInt(this.getNUM_POKEMONS());
                if (!codigosPokemons.contains(numero)) {
                    codigosPokemons.add(numero);
                    encontrou = true;
                }
            }
            this.addPokemon(pokemonsDisponiveis.get(numero));
        }
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void escolhePokemon(String jogadorNome) {
        Random random = new Random();
        Boolean escolheu = false;
        Integer numero = 0;

        while (!escolheu) {
            numero = random.nextInt(this.getNUM_POKEMONS());
            if (this.pokemons.get(numero).getVida()>0) {
                escolheu = true;
                this.setIdPokemonAtual(numero);
            }
        }
        System.out.println(jogadorNome + " escolheu " + this.pokemons.get(this.getIdPokemonAtual()).getNome() + " para lutar!");   
    }

    public Double escolheAtaque() {        
        Integer opcao;
        Random random = new Random();
        /* Aqui a opcao é sorteada em vez de escolhida */
        opcao = random.nextInt(this.pokemons.get(this.getIdPokemonAtual()).getNomesAtaques().size());
        System.out.println("\nO ataque " + this.pokemons.get(this.getIdPokemonAtual()).getNomesAtaques().get(opcao) + " foi escolhido!");        
        /* Retorna um valor -10 a 10 sobre o valor base */        
        return this.pokemons.get(this.getIdPokemonAtual()).getDanosAtaques().get(opcao) +  Double.valueOf(random.nextInt(20) - 10);
    }
}
