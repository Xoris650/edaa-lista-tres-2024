package Word_Busca.atv2;

import Word_Busca.atv2.classes.Produto;

import java.util.ArrayList;

public class Search {
    public static ArrayList<Produto> searchProdPerPrice(Produto[] produtos, Double price){
        ArrayList<Produto> samePrice = new ArrayList<>();
        int n = produtos.length;
        int left = 0;
        int right = n - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if (produtos[mid].getPrice().equals(price)){
                samePrice.add(produtos[mid]);
            }else if(produtos[mid].getPrice() > price){
                right = mid -1;
            }else if(produtos[mid].getPrice() < price){
                left = mid + 1;
            }
        }

        return samePrice;
    }
}
