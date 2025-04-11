package org.skypro.skyshop.Product.DiscountedProduct;

import org.skypro.skyshop.Product.Product;

public class DiscountedProduct extends Product {

    private int price;
    private double discount;

    public DiscountedProduct(String name, int price, double discount) {
        super(name);
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть строго больше нуля");
        }
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Скидка должна быть числом в диапазоне от 0 до 100 включительно");
        }
        this.price = price;
        this.discount = discount;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть строго больше нуля");
        }
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
