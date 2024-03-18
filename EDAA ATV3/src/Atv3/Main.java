package Atv3;

import Atv3.Sort.Sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Frase: ");
        String frase = sc.nextLine();

        char[] listChar = Sort.bubbleInsertion(frase);

        System.out.println(listChar);
    }
}
