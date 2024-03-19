package Word.Atv1;

import Word.Atv1.Classe.Jogador;
import Word.Atv1.Sort.Sort;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Creating a list of players
        ArrayList<Jogador> listaJogadores = new ArrayList<>();
        //Using the names of another exercise to create the players.
        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
                "Breno Vinicius", "Vinícius Raphael",
                "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
                "Felipe dos Santos",
                "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
                "Henrique Cezar",
                "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira"};

        for(String name : nomes){
            listaJogadores.add(new Jogador(name));
        }
        System.out.println("Desordenado");
        System.out.println("-------------");

        for(Jogador j : listaJogadores){
            System.out.println(j);
        }
        Sort.selectionSort(listaJogadores);
        System.out.println("\nOrdenado");
        System.out.println("-------------");
        for(Jogador j : listaJogadores){
            System.out.println(j);

        }
    }


}
