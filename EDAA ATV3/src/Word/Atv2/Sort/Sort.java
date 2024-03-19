package Word.Atv2.Sort;

import Word.Atv2.Classe.Contato;

import java.util.ArrayList;

public class Sort {

    public static char[] stringToArray(String s){
        char[] arr = new char[s.length()];
        for(int i =0; i < s.length(); i++){
            arr[i] = s.toLowerCase().charAt(i);
        }
        return arr;
    }
    public static int compareChar(String s1, String s2){
        char[] arr1 = stringToArray(s1);
        char[] arr2 = stringToArray(s2);

        for(int i = 0; i < arr1.length; i++){
            if((int)arr1[i] < (int)arr2[i]){
                return -1;
            }else if((int)arr1[i] > (int)arr2[i]){
                return 1;
            }
        }
        return 0;
    }

    public static void insertionSort(ArrayList<Contato> contatos){
        for(int i = 1; i < contatos.size(); i++){
            Contato temp = contatos.get(i);
            int j = i - 1;
            while(j >= 0 && compareChar(contatos.get(j).getNome(), temp.getNome()) > 0){
                contatos.set(j+1, contatos.get(j));
                j--;
            }
            contatos.set(j+1, temp);
        }
    }




//    public static void namesInsertionSort(ArrayList<String> nameList){
//        for(int i = 1; i < nameList.size(); i++){
//            String temp = nameList.get(i);
//            int j = i - 1;
//            while(j >= 0 && compareNameChar(nameList.get(j), temp) > 0){
//                nameList.set(j+1, nameList.get(j));
//                j--;
//            }
//            nameList.set(j+1,temp);
//        }
//    }
}
