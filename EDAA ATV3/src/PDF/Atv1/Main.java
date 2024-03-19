package PDF.Atv1;

import PDF.Atv1.Classes.Pessoa;
import PDF.Atv1.Classes.Sort;

import java.util.ArrayList;

public class Main {
    public static void printAll(ArrayList<Pessoa> pessoas){
        for(Pessoa p : pessoas){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        String[] nomes = {"Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
                "Breno Vinicius", "Vinícius Raphael",
                "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
                "Felipe dos Santos",
                "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
                "Henrique Cezar",
                "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
                "Marcus Paulo",
                "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Nátali Isaltino",
                "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique",
                "Vinicius Garcia",
                "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves",
                "Lucas Marques",
                "Marcela Maria"};

        for(String nome : nomes) {
            listaPessoas.add(new Pessoa(nome));
        }
        ArrayList<Pessoa> listaOrdenada = new ArrayList<>(listaPessoas);
        System.out.println("Desordenado: ");
        printAll(listaPessoas);

        System.out.println("\nOrdenado: ");
        Sort.insertionSort(listaOrdenada);
        printAll(listaOrdenada);

    }
}
