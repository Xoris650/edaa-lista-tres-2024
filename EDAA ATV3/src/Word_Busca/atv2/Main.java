package Word_Busca.atv2;

import Word_Busca.atv2.classes.Produto;

import java.time.LocalDate;
import java.util.ArrayList;


//!TIRAR DUVIDA COM A PROF


public class Main {
    public static void main(String[] args) {
        Produto[] produtos = {
                new Produto("teste", 1.00, LocalDate.of(2024,3,12)),
                new Produto("teste", 0.00, LocalDate.of(2024,3,13)),
                new Produto("teste", 0.00, LocalDate.of(2024,3,14)),
                new Produto("teste", 1.00, LocalDate.of(2024,3,15)),
                new Produto("teste", 0.50, LocalDate.of(2024,3,16)),
                new Produto("teste", 0.00, LocalDate.of(2024,3,17))
        };

        ArrayList<Produto> res = Search.searchProdPerPrice(produtos, 0.00);

        for (Produto produto : res){
            System.out.println(produto);
        }
    }
}
