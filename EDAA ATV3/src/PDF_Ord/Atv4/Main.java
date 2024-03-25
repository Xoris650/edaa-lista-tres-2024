package PDF_Ord.Atv4;

import PDF_Ord.Atv4.Sort.Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        System.out.println("Quantos nomes deseja digitar: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("Nome %d: ", i+1);
            String name = sc.next();

            nameList.add(name);
        }

        Sort.selectionSort(nameList);
        System.out.println("Nomes Ordenados:");
        System.out.println("-----------------");
        for(String name : nameList){
            System.out.println(name);
        }
    }
}
