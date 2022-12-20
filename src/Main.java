import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Jogador.JogadorHumano;
import Jogador.JogadorNPC;

public class Main {  
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String opcao;                

        do {
            opcao = loopPrincipal();            
            switch (opcao) {
                case "0":
                    despedida();
                    break;  
                case "1":
                    jogar();
                    break;
                case "2":
                    configuracoes();                
                    break;
                case "3":
                    estatisticas();                
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        } while (!opcao.equals("0"));
        Main.scanner.close();             
    }   

    private static void jogar() {
        JogadorHumano jogador;
        Integer numPartida = 0, NUM_NPCS = 3;
        Double valorAtaque;
        ArrayList<JogadorNPC> npcs = new ArrayList<JogadorNPC>();
        Boolean temVidaNpc = true, temVidaJogador = true;

        jogador = new JogadorHumano(obterNomeJogador());        
        for (int i=0;i<NUM_NPCS;i++) {            
            npcs.add(new JogadorNPC());        
        }

        animacao1(jogador.getNome());

        do {
            animacao2(npcs.get(numPartida),numPartida+1);
            jogador.escolhePokemon();
            
            do {                                
                valorAtaque = jogador.escolheAtaque();                   
                System.out.println(npcs.get(numPartida).pokemons.get(npcs.get(numPartida).getIdPokemonAtual()).getNome() + "[" + npcs.get(numPartida).pokemons.get(npcs.get(numPartida).getIdPokemonAtual()).getVida() + "] sofreu um ataque de " + valorAtaque  + " pontos." );
                temVidaNpc = npcs.get(numPartida).pokemons.get(npcs.get(numPartida).getIdPokemonAtual()).recebeAtaque(valorAtaque);                
                if (npcs.get(numPartida).getTotalPokemonsVivos() > 0) {
                    if (!temVidaNpc) {
                        npcs.get(numPartida).escolhePokemon(npcs.get(numPartida).getNome());
                    }                    
                    System.out.println("\n" + npcs.get(numPartida).getNome() + " está atacando...");
                    valorAtaque = npcs.get(numPartida).escolheAtaque();                    
                    System.out.println(jogador.pokemons.get(jogador.getIdPokemonAtual()).getNome() + "[" + jogador.pokemons.get(jogador.getIdPokemonAtual()).getVida() + "] sofreu um ataque de " + valorAtaque  + " pontos." );
                    temVidaJogador = jogador.pokemons.get(jogador.getIdPokemonAtual()).recebeAtaque(valorAtaque);
                    if (!temVidaJogador && jogador.pokemons.get(jogador.getIdPokemonAtual()).getRevives() > 0) {
                        jogador.pokemons.get(jogador.getIdPokemonAtual()).mostrarRevive();
                    } else if (!temVidaJogador && jogador.getTotalPokemonsVivos() <= 0) {
                        System.out.println("\nVocê perdeu esta partida!");
                    }
                }
                else {
                    System.out.println("\nVocê venceu esta partida!");
                    jogador.ganhaPedraEvolucao();
                    jogador.escolheEvolucao();
                    jogador.restauraPokemons();
                } 
            } while (jogador.getTotalPokemonsVivos() > 0 && npcs.get(numPartida).getTotalPokemonsVivos() > 0);

            numPartida++;    
        } while (numPartida < NUM_NPCS && jogador.getTotalPokemonsVivos() > 0);
        // TODO: encerramento: vitoria ou derrota!
    }

    private static void animacao2(JogadorNPC npc, Integer numPartida) {
        System.out.println("\nO seu " + numPartida.toString() + "º adversário é... " + npc.getNome() );
        System.out.println("Especialidade: " + npc.getEspecialidade());   
        npc.escolhePokemon(npc.getNome());
    }

    private static void animacao1(String nome) {        
        System.out.print("\nTenha uma boa sorte, " + nome + "!\n");                
    }

    private static String obterNomeJogador() {
        String nome;

        System.out.print("Qual o seu nome? ");
        nome = Main.scanner.nextLine();

        return nome;
    }

    private static void estatisticas() {
        // TODO: informar estatisticas das partidas
    }

    private static void configuracoes() {
        // TODO: alteracao do nome do jogador
    }

    private static void despedida() {
        // TODO: imprimir uma frase de despedida de acordo com o jogo. se nao houve jogo, se houve jogo com vitoria ou com derrota
    }   

    /*
     * Imprime o menu principal e retorna a opção desejada
     */
    private static String loopPrincipal() {        
        String opcao;
        
        System.out.println("\nEscolha uma das opções abaixo: ");
        System.out.println("1 - Jogar");
        System.out.println("2 - Configurações");       
        System.out.println("3 - Estatísticas");
        System.out.println("0 - Sair");
        System.out.print("\nOpção desejada: ");        
        opcao = Main.scanner.nextLine();
        System.out.println("");     
        
        return opcao;
    }
}