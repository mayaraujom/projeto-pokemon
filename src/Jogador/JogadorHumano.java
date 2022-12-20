package Jogador;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Pokemons.Bulbasaur;
import Pokemons.Charmander;
import Pokemons.Pokemon;
import Pokemons.Squirtle;

public class JogadorHumano extends Jogador {
    static Scanner scanner = new Scanner(System.in);
    private Integer pedrasEvolucao = 0;    

    public JogadorHumano(String nome) {
        Pokemon bulbasaur = new Bulbasaur(1), charmander = new Charmander(1), squirtle = new Squirtle(1);        
        this.setNome(nome);
        this.addPokemon(bulbasaur);
        this.addPokemon(charmander);
        this.addPokemon(squirtle);
    }

    public void escolhePokemon() {           
        Boolean escolheu = false;
        ArrayList<String> opcoesValidas = new ArrayList<String>();
        Integer i = 0;
        String opcao;

        while (!escolheu) {
            System.out.println("\nEscolha um dos Pokemons abaixo: \n");
            i = 0;        
            for (Pokemon pokemon : pokemons) {
                i++;
                if (pokemon.getVida()>0) {
                    System.out.println(i + ": " + pokemon.getNome());
                    opcoesValidas.add(i.toString());
                }                
            }
            System.out.print("\nSua escolha: ");
            opcao = JogadorHumano.scanner.nextLine();
            if (!opcoesValidas.contains(opcao)) {
                System.out.println("\nOpção inválida!");
            }
            else {
                escolheu = true;
                System.out.println(this.pokemons.get(Integer.parseInt(opcao)-1).getNome()+ " foi escolhido para a batalha!");
                this.setIdPokemonAtual(Integer.parseInt(opcao)-1);                
            }        
        }        
    }

    public Double escolheAtaque() {        
        Boolean escolheu = false;        
        String opcao = "-1";
        Random random = new Random();

        while (!escolheu) {
            if (this.pokemons.get(this.getIdPokemonAtual()).getVida() <= 0) {
                this.escolhePokemon();
            }
            System.out.println("\nSua vez de atacar!");
            System.out.println("\nEscolha um dos ataques abaixo: ");
            System.out.println("\n[" + this.pokemons.get(this.getIdPokemonAtual()).getNome() + " - " + this.pokemons.get(this.getIdPokemonAtual()).getVida() + "]\n");           
            for (int i=0;i<this.pokemons.get(this.getIdPokemonAtual()).getNomesAtaques().size();i++) {
                System.out.println(i+1 + ": " + this.pokemons.get(this.getIdPokemonAtual()).getNomesAtaques().get(i) + " (" + this.pokemons.get(this.getIdPokemonAtual()).getDanosAtaques().get(i) +")");
            }
            System.out.print("\nSua escolha: ");
            opcao = JogadorHumano.scanner.nextLine();
            try {
                if (Integer.parseInt(opcao)-1 < 0 || Integer.parseInt(opcao)-1 > this.pokemons.get(this.getIdPokemonAtual()).getNomesAtaques().size()-1 ) {
                    System.out.println("\nOpção inválida!");
                }
                else {
                    escolheu = true;
                    System.out.println("\nO ataque " + this.pokemons.get(this.getIdPokemonAtual()).getNomesAtaques().get(Integer.parseInt(opcao)-1) + " foi escolhido!");
                }

            } catch (NumberFormatException e) {
                System.out.println("\nOpção inválida!");
            }                   
        }        
        /* Retorna um valor -10 a 10 sobre o valor base */        
        return this.pokemons.get(this.getIdPokemonAtual()).getDanosAtaques().get(Integer.parseInt(opcao)-1) +  Double.valueOf(random.nextInt(20) - 10);
    }

    public void escolheEvolucao () {        
        ArrayList<String> opcoesValidas = new ArrayList<String>();
        Integer i = 0;
        String opcao = "-1";

        while (!opcao.equals("0") && this.pedrasEvolucao > 0) {
            System.out.println("\nEscolha um dos Pokemons abaixo para evoluir: \n");
            i = 0;        
            for (Pokemon pokemon : pokemons) {
                i++;
                if (pokemon.getVida()>0) {
                    System.out.println(i + ": " + pokemon.getNome());
                    opcoesValidas.add(i.toString());
                }                
            
            }
            System.out.print("0: Voltar ");
            System.out.print("\nSua escolha: ");
            opcao = JogadorHumano.scanner.nextLine();
            if (!opcoesValidas.contains(opcao) && !opcao.equals("0") ) {
                System.out.println("\nOpção inválida!");
            }
            else if (!opcao.equals("0")) {
                    if (this.pokemons.get(Integer.parseInt(opcao)-1).getNivel() < this.pokemons.get(Integer.parseInt(opcao)-1).getNomesEvolucoes().size()) {                        
                        System.out.print("O Pokemon " + this.pokemons.get(Integer.parseInt(opcao)-1).getNome() );
                        this.pokemons.get(Integer.parseInt(opcao)-1).evoluir(this.pokemons.get(Integer.parseInt(opcao)-1).getNivel()+1);
                        System.out.println(" evolui para " + this.pokemons.get(Integer.parseInt(opcao)-1).getNome());
                        this.usaPedraEvolucao();
                    } else {
                        System.out.println("O Pokemon " + this.pokemons.get(Integer.parseInt(opcao)-1).getNome() + " já está no seu último nível!");
                    }
                
            }        
        }
    }

    public Integer getPedrasEvolucao() {
        return pedrasEvolucao;
    }

    public void usaPedraEvolucao() {
        this.pedrasEvolucao--;
    }

    public void ganhaPedraEvolucao() {
        this.pedrasEvolucao++;
    }

    public void restauraPokemons() {        
        for (Pokemon pokemon : pokemons) {
            pokemon.setNivel(pokemon.getNivel());
            pokemon.restauraRevives();
        }
    }
}