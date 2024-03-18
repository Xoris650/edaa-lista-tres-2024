package Atv3.Sort;

import java.util.ArrayList;

public class Sort {
    public static char[] stringToArray(String s){
        char[] arr = new char[s.length()];
        for(int i =0; i < s.length(); i++){
            arr[i] = s.toLowerCase().charAt(i);
        }
        return arr;
    }

    public static int compareChar(char c1, char c2){
        if((int) c1 < (int) c2){
            return -1;
        }else if((int) c1 > (int) c2){
            return 1;
        }
        return 0;
    }

    public static char[] bubbleInsertion(String frase){
        char[] charList = stringToArray(frase);
        int n = charList.length;
        boolean troca;

        do{
            troca = false;
            for(int i = 0; i < charList.length - 1; i++) {
                if (compareChar(charList[i], charList[i + 1]) > 0) {
                    char temp = charList[i];
                    charList[i] = charList[i + 1];
                    charList[i + 1] = temp;
                    troca = true;
                }
                n--;
            }
        }while(troca);
        return charList;
    }

}
