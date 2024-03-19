package Word.Atv1.Classe;

import java.util.Random;

public class Jogador {
    private String name;
    private int points;

    public Jogador(String name){
        this.name = name;
        this.points = new Random().nextInt(1001);
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int comparePoints(int points){
        if(getPoints() < points){
            return -1;
        }else if(getPoints() > points){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Jogador: %s - %d pontos", getName(), getPoints());
    }
}
