package PDF.Atv3;

import PDF.Atv3.Sort.Sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Frase: ");
        String frase = sc.nextLine();

        //!TIRAR DUVIDA COM PROFESSORA
        char[] listChar = Sort.bubbleInsertion(frase);

        System.out.println(listChar);
    }
}
