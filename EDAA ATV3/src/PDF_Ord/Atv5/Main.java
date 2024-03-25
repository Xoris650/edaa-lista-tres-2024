package PDF_Ord.Atv5;

import PDF_Ord.Atv5.Sort.Sort;

import java.util.Scanner;

public class Main {
    public static char[] stringToArray(String s){
        char[] arr = new char[s.length()];
        for(int i =0; i < s.length(); i++){
            arr[i] = s.toLowerCase().charAt(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] phraseCharList;
        System.out.print("Digite uma frase: ");
        String phrase = sc.next();
        phraseCharList = stringToArray(phrase);
        System.out.println("--------------");
        System.out.println("Organizado: ");
        Sort.quickSort(phraseCharList);
        System.out.println(phraseCharList);
    }
}
