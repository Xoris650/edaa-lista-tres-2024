package Word.Atv2;

import Word.Atv2.Classe.Contato;
import Word.Atv2.Sort.Sort;

import java.util.ArrayList;

public class Main {
    public static void printAll(ArrayList<Contato> contatos){
        System.out.println("Desordenado");
        System.out.println("-------------");
        for(Contato c : contatos){
            System.out.println(c);
        }
        Sort.insertionSort(contatos);
        System.out.println("\nOrdenado");
        System.out.println("-------------");
        for(Contato c : contatos){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
                "Breno Vinicius", "Vinícius Raphael",
                "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
                "Felipe dos Santos",
                "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
                "Henrique Cezar"};

        ArrayList<Contato> contatos = new ArrayList<>();
        for(String name : nomes){
            contatos.add(new Contato(name));
        }
        printAll(contatos);

    }
}
