package org.skypro.skyshop.basket;

import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.interfaces.Searchable;

import java.util.*;

public class ProductBasket {
    private Map<String, List<Product>>  map = new HashMap<>();

    public void addProduct(Product a) {
        if (!map.containsKey(a.getName())) {
            map.put(a.getName(), new ArrayList<>());
        }
            map.get(a.getName()).add(a);
    }

    public void printBasket() {
        int sum = 0;
        for (List<Product> products : map.values()) {
            for (Product product : products) {
                if (product != null) {
                    System.out.println(product);
                    sum += product.getPrice();
                }
            }

        }
        System.out.println("Итого: " + sum);
    }

    public void emptyBasket() {
        map.clear();
    }

    public List<Product> deleteProduct(String name) {
        return map.remove(name);
    }
}
