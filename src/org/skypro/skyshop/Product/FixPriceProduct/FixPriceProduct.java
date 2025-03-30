package org.skypro.skyshop.Product.FixPriceProduct;

import org.skypro.skyshop.Product.Product;

public class FixPriceProduct extends Product {

    private final int PRICE = 1000;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public String toString() {
        return getName() + " " + PRICE + ": " + PRICE;
    }
}
