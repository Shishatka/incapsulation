package org.skypro.skyshop.Product.SimpleProduct;

import org.skypro.skyshop.Product.Product;

public class SimpleProduct extends Product {
    private int price;

    public SimpleProduct(String name, int price) {
        super(name);
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    public String toString() {
        return getName() + ": " + price;
    }
}
