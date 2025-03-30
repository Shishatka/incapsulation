package org.skypro.skyshop.Product.SimpleProduct;

import org.skypro.skyshop.Product.Product;

public class SimpleProduct extends Product {
    int price;

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

    public String toString() {
        return getName() + ": " + price;
    }
}
