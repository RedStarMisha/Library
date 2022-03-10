package library.cards;
import reader.ReaderOfLibrary;
import paperproducts.*;

import java.util.Map;

public class ReaderCard {
    private final ReaderOfLibrary reader;
    Map<Integer , PaperProduct> takenProducts;

    public ReaderCard(ReaderOfLibrary reader) {
        this.reader = reader;
    }
}
