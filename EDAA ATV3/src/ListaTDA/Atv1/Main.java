package ListaTDA.Atv1;

import ListaTDA.Atv1.Classes.Player;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Sato", 123, 20, 2);
        Player p2 = new Player("Cleydde", 52, 62, 23);
        
        System.out.println("Informações dos Jogadores\n");
        System.out.println(p1);
        System.out.println("--------------------------");
        System.out.println(p2);
        System.out.println("--------------------------");
        System.out.println("É o GOAT?\n");
        System.out.println(p1.getName() + (p1.isGoat() ? " é o/a GOAT!" : " não é o GOAT!"));
        System.out.println("--------------------------");
        System.out.println(p2.getName() + (p2.isGoat() ? " é o/a GOAT!" : " não é o GOAT!"));
    }
}
