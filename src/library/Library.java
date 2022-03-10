package library;

import library.cards.PaperProductCard;
import library.cards.ReaderCard;
import paperproducts.PaperProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private int id = 1;
    Map <Integer , PaperProductCard> productMap = new HashMap<>();
    List<ReaderCard> readerCardList = new ArrayList<>();

    public void addProduct (PaperProduct product) {
        boolean existCard = false;
        for (PaperProductCard card : productMap.values()) {
            if (card.equals(product)) {
                existCard = true;
            }
        }
        if (existCard) {
            System.out.println("Такая книга уже есть");
        } else {
            productMap.put(id , new PaperProductCard(product , id));
            id++;
        }
    }

    public PaperProduct getProduct (int id) {
        if (productMap.containsKey(id)) {
            System.out.println("Такой книги не существует");
            return productMap.get(id).getProduct();
        }
        throw new RuntimeException();
    }

}
