package paperproducts;

public abstract class PaperProduct {
    protected String name;
    protected int year;

    public PaperProduct (String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

}
