package ListaAvaliativa1;

import ListaAvaliativa1.Classes.Game;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void quickSort(int[] intList){order(intList,0,intList.length - 1);}
    public static void order(int[] list, int left, int right){
        if(left < right){
            int[] p = particao(list, left, right);
            order(list, left, p[1]);
            order(list, p[0], right);
        }
    }

    public static int[] particao(int[] list, int left, int right){
        int i = left, j = right;
        int x = list[(i + j) / 2];
        while(i <= j){
            while(list[i] < x){
                i++;
            }
            while(list[j] > x){
                j--;
            }
            if(i <= j){
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j++;
            }
        }
        return new int[]{i,j};
    }

    public static void main(String[] args) throws IOException{

        //LER ARQUIVO
        List<List<String>> records = new ArrayList<>();
        ArrayList<Game> games = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("src/ListaAvaliativa1/data/JogosDesordenados.csv"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }
        //TRANSFORMANDO EM OBJ
        for(List<String> p : records) {
            games.add(new Game(p.get(0), p.get(1), Double.valueOf(p.get(2))));
        }

    }
}
