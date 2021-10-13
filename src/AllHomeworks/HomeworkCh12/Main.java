package AllHomeworks.HomeworkCh12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "TV", 1000);
        Product product2 = new Product(2, "Smartphone", 230);
        Product product3 = new Product(3, "headphones", 19);
        Product product4 = new Product(4, "Notebook", 580);
        Product product5 = new Product(5, "MicrowaveOven", 10);

        Shop shop = new Shop();
// создаем пару тройку товаров и добавляем эти товары в магазин
        shop.addProduct(product);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);
// получаем список товаров из магазина, сортируем по цене(по возрастанию) и выводим в консоль.
        Collections.sort(shop.receiveProduct(), new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o1.price, o2.price);
            }
        });
        System.out.println("Сортировка товаров по цене ");
        for (Product p : shop.receiveProduct()) {
            System.out.println(p.price);
        }
        System.out.println();

// удаляем один товар
        shop.deleteProduct(product2.id);
        // получаем список товаров из магазина, сортируем по порядку
        //добавления(последние добавленные в начале) и выводим в консоль.
        Collections.sort(shop.receiveProduct(), new Comparator<Product>() {
            @Override
            public int compare(Product o2, Product o1) {
                return Integer.compare(o1.id, o2.id);
            }
        });
        System.out.println("Сортировка товаров по добавлению в обратном порядке ");
        for (Product p : shop.receiveProduct())
            System.out.println(p.id);
        // редактируем один товар
        product3.setPrice(19);
        shop.redactProduct(product3);
        // получаем список товаров и выводим в консоль
        shop.receiveProduct();
        System.out.println();
        System.out.println("Список товаров");
        for (Product p : shop.receiveProduct()) {
            System.out.println(p);
        }
    }
}


