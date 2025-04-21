package org.skypro.skyshop.Product;

import org.skypro.skyshop.interfaces.Searchable;

import java.util.Objects;

public abstract class Product implements Searchable {
    private String name;

    public String getSearchTerm(){
        return name;
    }
    public String getContentType(){
        return "PRODUCT";
    }

    public Product(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Название продукта не может быть пустой строкой или null");
        }
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

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
