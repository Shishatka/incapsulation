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
        basket.addProduct(toiletPaper);
        basket.addProduct(toiletPaper);
        basket.addProduct(toiletPaper);
        System.out.println(basket.deleteProduct("toilet paper"));


        System.out.println(basket.getSum());
        System.out.println(basket.isInBasket("toilet paper"));
        System.out.println(basket.isInBasket("game boy"));
        basket.printBasket();

        basket.printBasket();
        System.out.println(basket.isInBasket("game boy"));

        FixPriceProduct nintendoSwitch = new FixPriceProduct("nintendo switch");
        DiscountedProduct nintendo = new DiscountedProduct("nintendo 3ds", 600, 50);
        System.out.println(nintendo);
        System.out.println(toiletPaper);
        System.out.println(nintendoSwitch);
        basket.addProduct(nintendo);
        basket.addProduct(nintendoSwitch);
        basket.addProduct(gameBoy);
        basket.addProduct(toiletPaper);
        System.out.println();
        basket.printBasket();
        System.out.println(nintendo.isSpecial());

        Article articleA = new Article("article A", "Hello, my name is Vasily");
        Article articleB = new Article("Article B", "Hi, Vasily!");
        SearchEngine engine = new SearchEngine(10);
        engine.add(articleA);
        engine.add(articleB);
        engine.add(nintendo);
        engine.add(gameBoy);


        System.out.println();
        System.out.println();

        SimpleProduct towel = new SimpleProduct("Towel", 100);
        DiscountedProduct discountedProduct = new DiscountedProduct("laptop", 1000, 50);

        engine.add(towel);

        try {
            System.out.println((engine.search("article A")));
            System.out.println((engine.search("game boy")));
            System.out.println(engine.search("lap"));
        } catch (BestResultNotFound e) {
            System.out.println("Результат не найден");
        }
    }
}