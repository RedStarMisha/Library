import library.Library;
import paperproducts.Book;
import paperproducts.Magazine;
import paperproducts.PaperProduct;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addProduct(new Book("Война и мир" , "Толстой" , 1876 , "Роман"));
        library.addProduct(new Magazine("Игромания" , 2021 , 345 , "Игровой журнал"));
        System.out.println(library.getProduct(1));
        PaperProduct product = new Book("Война и мир" , "Толстой" , 1876 , "Роман");
        Book product2 = new Book("Война и мир" , "Толстой" , 1876 , "Роман");
    }
}
