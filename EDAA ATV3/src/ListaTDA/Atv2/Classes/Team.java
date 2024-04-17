package ListaTDA.Atv2.Classes;
import java.util.ArrayList;

import ListaTDA.Atv1.Classes.Player;

public class Team {
    private String name;
    private String trainer;
    private int victories;
    private int draw;
    private int losses;
    private ArrayList<Player> players;
    
    public Team(){}
    
    public String getName() {
        return name;
    }

    public String getTrainer() {
        return trainer;
    }

    public int getVictories() {
        return victories;
    }

    public int getDraw() {
        return draw;
    }

    public int getLosses() {
        return losses;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setInfos(String name, String trainer, int victories, int draw, int losses, ArrayList<Player> players) throws SizeException{
        if(players.size() < 5){
            throw new SizeException("Deve ter no minimo 5 jogadores");
        }
        this.name = name;
        this.trainer = trainer;
        this.victories = victories;
        this.draw = draw;
        this.losses = losses;
        this.players = players;
    }

    public int calculatePoints(){
        return (this.victories * 3) + (this.draw);
    }

    @Override
    public String toString() {
        return String.format("Time: %s\nPontos: %d\nTecnico: %s\nVitorias: %d\nEmpates: %d\nDerrotas: %d", 
        getName(),calculatePoints(), getTrainer(),getVictories(), getDraw(), getLosses());
    }

    
    
}
