package Word.Atv3.Sort;



import Word.Atv3.Classe.Produto;

import java.util.ArrayList;

public class Sort {
    public static void quickSort(ArrayList<Produto> list) {
        ordena(list, 0, list.size() - 1);
    }

    private static void ordena(ArrayList<Produto> list, int esq, int dir) {
        if (esq < dir) {
            int[] p = particao(list, esq, dir);
            ordena(list, esq, p[1]);
            ordena(list, p[0], dir);
        }
    }

    private static int[] particao(ArrayList<Produto> list, int esq, int dir) {
        int i = esq, j = dir;
        Produto x = list.get((i + j) / 2);
        while (i <= j) {
            while (list.get(i).getPrice() < x.getPrice()) {
                i++;
            }
            while (list.get(j).getPrice() > x.getPrice()) {
                j--;
            }
            if (i <= j) {
                Produto temp = list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
                i++;
                j--;
            }
        }
        return new int[]{i, j};
    }
}
