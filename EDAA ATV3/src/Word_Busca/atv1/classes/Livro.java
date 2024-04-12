package Word_Busca.atv1.classes;
public class Livro {
    private String title;
    private String author;
    private int releaseYear;
    
    public Livro(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return String.format("Title: %s - by: %s - at: %d", getTitle(), getAuthor(), getReleaseYear());
    }

    
}
