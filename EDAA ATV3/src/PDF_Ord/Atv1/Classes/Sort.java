package PDF_Ord.Atv1.Classes;

import java.util.ArrayList;

public class Sort {
    public static void insertionSort(ArrayList<Pessoa> pessoas){
            for(int i = 1; i < pessoas.size(); i++){
                Pessoa temp = pessoas.get(i);
                int j = i-1;
                while(j >= 0 && pessoas.get(j).comparePersonChar(temp) > 0){
                    pessoas.set(j+1, pessoas.get(j));
                    j--;
                }
                pessoas.set(j+1, temp);
            }
        }
    }

