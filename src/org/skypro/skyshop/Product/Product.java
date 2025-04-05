package org.skypro.skyshop.Product;

import org.skypro.skyshop.interfaces.Searchable;

public abstract class Product implements Searchable {
    private String name;

    public String getSearchTerm(){
        return name;
    }
    public String getContentType(){
        return "PRODUCT";
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public abstract int getPrice();

    //public abstract void setPrice(int price);

    public String toString(Product product) {
        return name + " имя.";
    }

    public abstract boolean isSpecial();

}
