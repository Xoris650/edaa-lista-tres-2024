package Atv4.Sort;
import java.util.ArrayList;

public class Sort {
    public static int compareSize(String s1, String s2){
        if(s1.length() < s2.length()){
            return -1;
        }else if (s1.length() > s2.length()){
            return 1;
        }
        return 0;
    }
    public static void selectionSort(ArrayList<String> nameList){
        for(int i = 0; i < nameList.size() -1; i++){
            int min = i;
            for(int j = i+1; j < nameList.size(); j++){
                if(compareSize(nameList.get(j), nameList.get(min)) < 0){
                    min = j;
                }
            }
            String temp = nameList.get(min);
            nameList.set(min, nameList.get(i));
            nameList.set(i, temp);
        }
    }
}
