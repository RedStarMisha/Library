package paperproducts;

public class Magazine extends PaperProduct{
    private String genre;
    private int numOfRelease;

    public Magazine(String name , int year , int numOfRelease , String genre) {
        super(name, year);
        this.numOfRelease = numOfRelease;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Журнал " + name +
                " , издание " + numOfRelease +

                " (" + year + " г.)";
    }
}
