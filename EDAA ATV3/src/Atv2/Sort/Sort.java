package Atv2.Sort;


import java.util.ArrayList;

public class Sort {
    public static char[] stringToArray(String s){
        char[] arr = new char[s.length()];
        for(int i =0; i < s.length(); i++){
            arr[i] = s.toLowerCase().charAt(i);
        }
        return arr;
    }
    public static int compareNameChar(String name, String name2){
        char[] arr1 = stringToArray(name);
        char[] arr2 = stringToArray(name2);

        for(int i = 0; i < arr1.length; i++){
            if((int)arr1[i] < (int)arr2[i]){
                return -1;
            }else if((int)arr1[i] > (int)arr2[i]){
                return 1;
            }
        }
        return 0;
    }
    public static void namesInsertionSort(ArrayList<String> nameList){
        for(int i = 1; i < nameList.size(); i++){
            String temp = nameList.get(i);
            int j = i - 1;
            while(j >= 0 && compareNameChar(nameList.get(j), temp) > 0){
                nameList.set(j+1, nameList.get(j));
                j--;
            }
            nameList.set(j+1,temp);
        }
    }
}
