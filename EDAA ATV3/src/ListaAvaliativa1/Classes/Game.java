package ListaAvaliativa1.Classes;

public class Game {
    private String name;
    private String genre;
    private Double rate;

    public Game(String name, String genre, Double rate) {
        this.name = name;
        this.genre = genre;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", rate=" + rate +
                '}';
    }
}
