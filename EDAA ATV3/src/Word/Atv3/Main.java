package Word.Atv3;

import Word.Atv3.Classe.Produto;
import Word.Atv3.Sort.Sort;

import java.util.ArrayList;

public class Main {
    public static void printAll(ArrayList<Produto> produtos){
        System.out.println("Desordenado: ");
        System.out.println("-------------");
        for(Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println("\nOrdenado");
        System.out.println("-------------");
        Sort.quickSort(produtos);
        for(Produto produto : produtos){
            System.out.println(produto);
        }

    }
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto p = new Produto("Açucar", 5.00);
        Produto p2 = new Produto("Arroz", 30.00);
        Produto p3 = new Produto("Doritos", 14.00);
        Produto p4 = new Produto("Gift Card Steam", 50.00);

        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p);
        produtos.add(p4);

        printAll(produtos);
    }
}
