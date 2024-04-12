package Word_Busca.atv4;

import Word_Busca.atv4.classes.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro[] books =  {
            new Livro("How to fart 101", "Elon Muskitou", 2024),
            new Livro("My father is a butcher", "Isaac Neutro", 1545),
            new Livro("OMG my daugther turn into a zombie", "Abraham Linux", 2013),
            new Livro("Separate by Slaves", "William Afton", 2588),
            new Livro("The hole bible", "JESUS", 500),
       };
       System.out.println("Digite o titulo do livro q deseja procurar: ");
       String title = sc.nextLine();
       int result = Search.binarySearch(books, title);
       if(result < 0){
        System.out.println("Vai toma no cu, não encontramos o livro!");
       }else{
        System.out.printf("Encontramos na posição: %d\nTitulo: %s\nFeito por: %s\nLançado em: %d",
            result, books[result].getTitle(), books[result].getAuthor(), books[result].getReleaseYear());
       }
    }
}