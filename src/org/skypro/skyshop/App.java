package org.skypro.skyshop;

import org.skypro.skyshop.Exceptions.BestResultNotFound;
import org.skypro.skyshop.Product.DiscountedProduct.DiscountedProduct;
import org.skypro.skyshop.Product.FixPriceProduct.FixPriceProduct;
import org.skypro.skyshop.Product.Product;
import org.skypro.skyshop.Product.SimpleProduct.SimpleProduct;
import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Product toiletPaper = new SimpleProduct("toilet paper", 100);
        Product gameBoy = new SimpleProduct("game boy", 500);
        ProductBasket basket = new ProductBasket();

        FixPriceProduct nintendoSwitch = new FixPriceProduct("nintendo switch");
        DiscountedProduct nintendo = new DiscountedProduct("nintendo 3ds", 600, 50);
        Article articleA = new Article("article A", "Hello, my name is Vasily");
        Article articleB = new Article("article B", "Hi, Vasily!");
        SearchEngine engine = new SearchEngine();
        Product towel = new SimpleProduct("towel", 100);
        Product towel2 = new FixPriceProduct("towel");

        basket.addProduct(nintendo);
        basket.addProduct(nintendoSwitch);
        basket.addProduct(gameBoy);
        basket.addProduct(toiletPaper);
        basket.addProduct(towel);
        basket.addProduct(towel2);

        basket.deleteProduct("game boy");
        basket.printBasket();
        System.out.println(basket.deleteProduct("towel"));



        System.out.println();
        System.out.println();


        DiscountedProduct discountedProduct = new DiscountedProduct("laptop", 1000, 50);

        engine.addSet(articleA);
        engine.addSet(articleB);
        engine.addSet(nintendo);
        engine.addSet(gameBoy);
        engine.addSet(articleA);
        engine.addSet(articleA);
        engine.addSet(towel);
        engine.addSet(nintendo);
        engine.addSet(toiletPaper);

        try {
            System.out.println(engine.searchSet("toilet paper"));
        }
        catch (BestResultNotFound bestResultNotFound) {
            System.out.println("Nothing found");
        }
    }

}