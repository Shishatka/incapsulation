package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ProductBasket {
    //private Product[] list = new Product[5];
    private ArrayList<Product> list = new ArrayList<>();

    public void addProduct(Product a) {
        list.add(a);
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
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {

                System.out.println(list.get(i));
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
        list.clear();
    }

    public ArrayList<Product> deleteProduct(String name) {
        ArrayList<Product> deleted = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                deleted.add(list.get(i));
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
            }
        }
        if (deleted.isEmpty()) {
            System.out.println("Список пуст");
        }
        return deleted;
    }
}
