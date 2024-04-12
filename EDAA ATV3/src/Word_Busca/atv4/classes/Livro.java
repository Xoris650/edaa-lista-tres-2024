package Word_Busca.atv4.classes;
public class Livro {
    private final String title;
    private final String author;
    private final int releaseYear;
    
    public Livro(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }


    @Override
    public String toString() {
        return String.format("Title: %s - by: %s - at: %d", getTitle(), getAuthor(), getReleaseYear());
    }

    
}
