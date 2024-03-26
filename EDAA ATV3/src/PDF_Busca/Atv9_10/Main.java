package PDF_Busca.Atv9_10;

public class Main {
    public static int binarySearch(int[] list, int x){
        int n = list.length;
        int esq = 0;
        int dir = n-1;

        while(esq <= dir){
            int mid = (esq + dir) / 2;
            if(list[mid] == x){
                return mid;
            }else if(list[mid] > x){
                dir = mid - 1;
            }else if(list[mid] < x){
                esq = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws InterruptedException {
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
                65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
                75, 76, 77, 78, 79, 80, 81,
                82, 83, 84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

        System.out.println("Buscando o índice de 99...");
        Thread.sleep(3000);
        int result = binarySearch(listaNumeros, 99);
        System.out.printf("O índice de 99 é: %d\n", result);
        Thread.sleep(3000);
        System.out.println("Buscando o índice de 81...");
        Thread.sleep(3000);
        result = binarySearch(listaNumeros, 81);
        System.out.printf("O índice de 81 é: %d", result);
    }
}
