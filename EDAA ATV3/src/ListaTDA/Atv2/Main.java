package ListaTDA.Atv2;

import java.util.ArrayList;

import ListaTDA.Atv1.Classes.Player;
import ListaTDA.Atv2.Classes.SizeException;
import ListaTDA.Atv2.Classes.Team;

public class Main {
    public static void main(String[] args) {
        Team t1 = new Team();
        Team t2 = new Team();
        Team[] teams = {t1,t2};
        ArrayList<Player> p1List = new ArrayList<>();
        ArrayList<Player> p2List = new ArrayList<>();
        //Adicionando elementos a lista
        p1List.add(new Player("Rogerio",50,22,35));
        p1List.add(new Player("Ricardo",340,17,105));
        p1List.add(new Player("Rafael",10,22,0));
        p1List.add(new Player("Albert", 55, 62, 3));
        p1List.add(new Player("Bill", 87, 62, 55));
        //Adicionando elementos a lista 2
        p2List.add(new Player("Jorge", 65, 33, 10));
        p2List.add(new Player("Nelintow", 10, 3,11));
        p2List.add(new Player("Rodrigo", 22, 17,3));
        p2List.add(new Player("Kendrick", 110, 47,30));
        p2List.add(new Player("Paulo", 15 , 20 ,10));

        try{
            t1.setInfos("FLamengo", "Alberto Calabreso", 35, 10, 0, p1List);
            t2.setInfos("Vasco", "Rodrigo Olimpiano", 10, 48, 44, p2List);
        }catch(SizeException err){
            System.out.println(err.getMessage());
        }
        finally{
            for (Team team : teams) {
                System.out.println(team);
                System.out.println("-----------------");
            }
        }
        
    }
}
