package org.skypro.skyshop;

import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.basket.ProductBasket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Product toiletPaper = new Product("toilet paper", 100);
        Product gameBoy = new Product("game boy", 500);

        ProductBasket basket = new ProductBasket();
        basket.addProduct(toiletPaper);
        basket.addProduct(toiletPaper);
        basket.addProduct(toiletPaper);
        basket.addProduct(toiletPaper);
        basket.addProduct(toiletPaper);
        basket.addProduct(toiletPaper);


        System.out.println(basket.getSum());
        System.out.println(basket.isInBasket("toilet paper"));
        System.out.println(basket.isInBasket("game boy"));
        basket.printBasket();
        basket.emptyBasket();
        basket.printBasket();
        System.out.println(basket.isInBasket("game boy"));

    }
}