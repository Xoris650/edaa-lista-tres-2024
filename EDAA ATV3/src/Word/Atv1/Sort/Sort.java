package Word.Atv1.Sort;

import Word.Atv1.Classe.Jogador;

import java.util.ArrayList;

public class Sort {

    public static void selectionSort(ArrayList<Jogador> players){
        for(int i = 0; i < players.size(); i++){
            int min = i;
            for(int j = i+1; j < players.size(); j++){
                if(players.get(j).comparePoints(players.get(min).getPoints()) > 0){
                    min = j;
                }
            }
            Jogador temp = players.get(min);
            players.set(min, players.get(i));
            players.set(i, temp);
        }
    }


//    public static void selectionSort(ArrayList<String> nameList){
//        for(int i = 0; i < nameList.size() -1; i++){
//            int min = i;
//            for(int j = i+1; j < nameList.size(); j++){
//                if(compareSize(nameList.get(j), nameList.get(min)) < 0){
//                    min = j;
//                }
//            }
//            String temp = nameList.get(min);
//            nameList.set(min, nameList.get(i));
//            nameList.set(i, temp);
//        }
//    }
}
