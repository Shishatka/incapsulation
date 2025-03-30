package org.skypro.skyshop.Product;

public abstract class Product {
    private String name;


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

}
