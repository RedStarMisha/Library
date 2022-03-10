package paperproducts;

public class Book extends PaperProduct{
    private String autor;
    private String genre;

    public Book(String name, String autor, int year, String genre) {
        super(name, year);
        this.autor = autor;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Книга {" +
                "автор ='" + autor + '\'' +
                ", название ='" + name + '\'' +
                '}';
    }
}
