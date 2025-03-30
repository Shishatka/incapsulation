package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product.Product;

public class ProductBasket {
    private Product[] list = new Product[5];

    public void addProduct(Product a) {
        if (isFull()) {
            System.out.println("Невозможно добавить товар");
            return;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = a;
                break;
            }
        }
    }

    public int getSum() {
        int sum = 0;
        for (Product pro: list) {
            if (pro != null) {
                sum = sum + pro.getPrice();
            }
        }
        return sum;
    }

    public void printBasket() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {

                System.out.println(list[i].getName() + ": " + list[i].getPrice());
            }
        }
        System.out.println("Итого: " + getSum());
    }

    public boolean isInBasket(String name) {
        for (Product pro: list) {
            if (pro != null) {
                if (pro.getName().equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void emptyBasket() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
    }

    private boolean isFull() {
        if (list[list.length-1] != null) {
            return true;
        }
        else {
            return false;
        }
    }
}
