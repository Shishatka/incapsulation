package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.interfaces.Searchable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class ProductBasket {
    //private ArrayList<Product> list = new ArrayList<>();
    private HashMap<String, Product>  map = new HashMap<>();


    public void addProduct(Product a) {
        map.put(a.getSearchTerm(), a);
    }

    public int getSum() {
        int sum = 0;
        for (String i : map.keySet()) {
            if (i != null) {
                sum = sum + map.get(i).getPrice();
            }
        }
        return sum;
    }

    public void printBasket() {
        for (String i : map.keySet()) {
            if (i != null) {
                System.out.println(map.get(i));
            }
        }
        System.out.println("Итого: " + getSum());
    }
    /*
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
    */
    public void emptyBasket() {
        map.clear();
    }

    public ArrayList<Product> deleteProduct(String name) {
        ArrayList<Product> deleted = new ArrayList<>();

        for (String i: map.keySet()) {
            if (map.get(i).getName().equals(name)) {
                deleted.add(map.get(i));
            }
        }
        for (String j: map.keySet()) {
            if (map.get(j).getName().equals(name)) {
                map.remove(j);
                break;
            }
        }
        return deleted;
    }
}
