package PDF_Busca.Atv1_5;

import java.util.ArrayList;

public class Main {
    public static void printResult(int result){
        if(result >= 0){
            System.out.printf("Número encontrado no índice %d\n", result);
        }else{
            System.out.println("Não foi encontrado o numero");
        }
        System.out.println("----------------");
    }
    public static int linearSearch(int[] list, int item){
        for(int i = 0; i < list.length; i++){
            if (list[i] == item){
                return i;
            }
        }
        return -1;
    }
    public static ArrayList<Integer> searchAll(int[] list, int item){
        ArrayList<Integer> allIndex = new ArrayList<>();
        for(int i = 0; i < list.length; i++) {
            if(list[i] == item){
                allIndex.add(i);
            }
        }
        return allIndex;
    }
    public static void main(String[] args) throws InterruptedException {
        int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74,
                32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52,
                25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19,
                33, 21, 57, 19, 55, 93, 31, 54, 31, 50,
                66, 44, 54, 55, 29, 75, 43, 88, 61, 65,
                49, 87, 10, 25, 33, 70, 84, 125, 345, 400,
                77, 32, 41, 66, 33, 70, 84, 125, 600,
                38, 43, 51, 34, 76, 25, 48, 14, 50, 71,
                1, 98, 86, 38, 91, 65, 96, 60, 43, 75,
                86, 59, 17, 86, 12, 10, 16, 10, 33, 15,
                77, 22, 56, 4, 9, 63, 49, 80, 39, 53,
                97, 36, 34, 16, 1, 98, 78, 92, 100, 35 };

        System.out.println("Atividade 1");
        System.out.println("Buscando número 77...");
        Thread.sleep(1000);
        int result = linearSearch(listaNumeros, 77);
        printResult(result);
        System.out.println("Atividade 2");
        System.out.println("Buscando número 600...");
        Thread.sleep(1000);
        result = linearSearch(listaNumeros, 600);
        printResult(result);
        System.out.println("Atividade 3");
        System.out.println("Buscando número 56...");
        Thread.sleep(1000);
        result = linearSearch(listaNumeros, 56);
        printResult(result);
        System.out.println("Atividade 4");
        System.out.println("Buscando número 65...");
        Thread.sleep(1000);
        result = linearSearch(listaNumeros, 65);
        printResult(result);
        System.out.println("Atividade 5");
        System.out.println("O número 65 está nos indices: ");
        ArrayList<Integer> allIndex = searchAll(listaNumeros, 65);
        for(int item : allIndex){
            System.out.println(item);
        }
    }
}
