package PDF.Atv2;

import PDF.Atv2.Sort.Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printCompare(ArrayList<String> nameList, ArrayList<String> ordNameList){
        System.out.println("\nLista Desordenada");
        System.out.println("--------------");
        for(String name  : nameList){
            System.out.println(name);
        }
        System.out.println("\nLista Ordenada");
        System.out.println("--------------");
        for(String name: ordNameList){
            System.out.println(name);
        }
        System.out.println("--------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entry;
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Quantos nomes deseja digitar?");
        entry = sc.nextInt();
        for(int i = 0; i < entry; i++){
            System.out.printf("Nome #%d: ", i+1);
            String name = sc.next();
            names.add(name);
        }
        ArrayList<String> namesOrd = new ArrayList<>(names);
        Sort.namesInsertionSort(namesOrd);
        printCompare(names, namesOrd);

    }
}
