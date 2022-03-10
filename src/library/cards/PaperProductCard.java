package library.cards;
import library.ProductStatus;
import reader.ReaderOfLibrary;

import paperproducts.PaperProduct;

public class PaperProductCard {
    private final PaperProduct product;
    private final int id;
    private ProductStatus status;
    private ReaderOfLibrary reader;

    public PaperProductCard(PaperProduct product, int id) {
        this.product = product;
        this.id = id;
    }

    public PaperProduct getProduct() {
        return product;
    }
}
