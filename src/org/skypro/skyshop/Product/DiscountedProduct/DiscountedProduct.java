package org.skypro.skyshop.Product.DiscountedProduct;

import org.skypro.skyshop.Product.Product;

public class DiscountedProduct extends Product {

    int price;
    double discount;

    public DiscountedProduct(String name, int price, double discount) {
        super(name);
        this.price = price;
        this.discount = discount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return (int) (price * (discount/100));
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + " " + (int) discount + "%: " + getPrice() + " " + (int) discount + "%";
    }
}
