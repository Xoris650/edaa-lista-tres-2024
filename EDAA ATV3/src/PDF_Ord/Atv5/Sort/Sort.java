package PDF_Ord.Atv5.Sort;

public class Sort {
    public static int compareChar(char c1, char c2) {
        if ((int) c1 < c2) {
            return -1;
        } else if ((int) c1 > (int) c2) {
            return 1;
        }
        return 0;
    }

    public static void quickSort(char[] charList) {
        ordena(charList, 0, charList.length - 1);
    }

    private static void ordena(char[] list, int esq, int dir) {
        if (esq < dir) {
            int[] p = particao(list, esq, dir);
            ordena(list, esq, p[1]);
            ordena(list, p[0], dir);
        }
    }

    private static int[] particao(char[] list, int esq, int dir) {
        int i = esq, j = dir;
        char x = list[(i + j) / 2];
        while (i <= j) {
            while (list[i] < x) {
                i++;
            }
            while (list[j] > x) {
                j--;
            }
            if (i <= j) {
                char temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }
        return new int[]{i, j};
    }
}
