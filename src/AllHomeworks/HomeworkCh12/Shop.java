package AllHomeworks.HomeworkCh12;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    ArrayList<Product> listOfGoods = new ArrayList<>();

    /*
    методы:
• добавить товар(принимает объект товара и добавляет его в список
товаров). При попытке добавить товар с id уже существующем в списке,
вставка производится не должна
     */
    public void addProduct(Product product) {
//        if(!listOfGoods.contains(product)){
//            listOfGoods.add(product);
//        }
        boolean isProductExists = false;
        for (Product p : listOfGoods) {
            if (p.id == product.id) {
                isProductExists = true;
            }
        }
        if (!isProductExists) {
            listOfGoods.add(product);
        }
    }

    // получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в магазине)
    public List<Product> receiveProduct() {
        return listOfGoods;
    }

    //удалить товар (метод принимает id товара и удаляет из списка товар с
//соответствующим id)
    public void deleteProduct(int productId) {
        for (int i = 0; i < listOfGoods.size(); i++) {
            if (listOfGoods.get(i).id == productId) {
                listOfGoods.remove(productId);
            }
        }
        // listOfGoods.removeIf(p -> p.id == productId);
    }

    //редактировать товар(принимает объект товара и редактирует им список товаров)
    public void redactProduct(Product product) {
        for (Product p : listOfGoods) {
            if (p.id == product.id) {
                listOfGoods.set(listOfGoods.indexOf(p), product);
            }
        }
    }
}
