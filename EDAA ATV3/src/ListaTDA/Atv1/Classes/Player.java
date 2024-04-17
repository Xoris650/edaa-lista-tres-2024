package ListaTDA.Atv1.Classes;

public class Player {
    private String name;
    private int numMatches;
    private int goals;
    private int assists;
    
    //Empty Constructor
    public Player(){}
    //Constructor
    public Player(String name, int numMatches, int goals, int assists) {
        this.name = name;
        this.numMatches = numMatches;
        this.goals = goals;
        this.assists = assists;
    }

    
    //Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumMatches() {
        return numMatches;
    }
    public void setNumMatches(int numMatches) {
        this.numMatches = numMatches;
    }
    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        this.goals = goals;
    }
    public int getAssists() {
        return assists;
    }
    public void setAssists(int assists) {
        this.assists = assists;
    }

    public boolean isGoat(){
        return ((this.goals + (this.assists * .5)) / this.numMatches >= 0.5) ? true : false; 
    }

    @Override
    public String toString() {
        return String.format("Jogador: %s\nPartidas: %d\nGols: %d\nAssistencias: %d",getName(), getNumMatches(), getGoals(), getAssists());
    }

   

    
}
