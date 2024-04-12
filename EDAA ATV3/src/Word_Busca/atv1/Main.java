package Word_Busca.atv1;
import Word_Busca.atv1.classes.Livro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        Livro[] books =  {
            new Livro("How to fart 101", "Elon Muskitou", 2024),
            new Livro("My father is a butcher", "Isaac Neutro", 1545),
            new Livro("OMG my daugther turn into a zombie", "Abraham Linux", 2013),
            new Livro("Separate by Slaves", "William Afton", 2588),
            new Livro("The hole bible", "JESUS", 500),
       };
        System.out.println("Bem vindo a nossa biblioteca!");
        System.out.println("---------------------------");
        System.out.println("Pesquisar livro por: ");
        System.out.println("1 -> Titulo\n2 -> Autor\n3 -> Ano de publicação");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Digite o titulo: ");
                Search.searchByTitle(books, sc.next());
            case 2:
                System.out.println("Digite o autor: ");
        }

    }
}